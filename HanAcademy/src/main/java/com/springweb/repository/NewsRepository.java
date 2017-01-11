package com.springweb.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import com.springweb.services.DAOException;
import com.springweb.vo.AddNewsItemsRequest;
import com.springweb.vo.NewsVO;

@Repository
public class NewsRepository {

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Autowired
  TransactionTemplate tranxTemplate;

  /**
   * Get all the valid News Items from database.
   * 
   * @return
   * @throws DAOException
   */
  public List<NewsVO> getAllNews() throws DAOException{
    List<NewsVO> lstNews = new ArrayList<NewsVO>();
    try {

      lstNews.add(jdbcTemplate.queryForObject("SELECT newsID,newsTitle,newsDesc FROM HAN.TESTDB.NEWS WHERE SYSDATETIME() < endDate", new RowMapper<NewsVO>(){

        public NewsVO mapRow(ResultSet rs, int rowNum) throws SQLException {
          NewsVO newsVO = new NewsVO();
          newsVO.setNewsTitle(rs.getString("newsTitle"));
          newsVO.setNewsDesc(rs.getString("newsDesc"));
          return newsVO;
        }
        
      }));
      System.out.println("Result: " + lstNews.size());

    } catch (DataAccessException exception) {
      throw new DAOException("FATAL", exception.getMessage());
    }
    return lstNews;
  }
  
  public int addNewsItems(final AddNewsItemsRequest req) throws DAOException{
    int finalCount = 0;
    int[] count;
    
    try {
      final List<NewsVO> newNewsItems = req.getLstNews();
      count = jdbcTemplate.batchUpdate("INSERT INTO HAN.TESTDB.NEWS (newsID, newsTitle, newsDesc, stDate, endDate, createdBy, createdDate, updatedBy, updatedDate) "
          + "VALUES(NEXT VALUE FOR testdb.SEQ_TESTDB_NEWS, ?, ?, ?, ?, (SELECT adminUserID FROM HAN.TESTDB.ADMIN_USER WHERE adminUsername = ?), SYSDATETIME(), (SELECT adminUserID FROM HAN.TESTDB.ADMIN_USER WHERE adminUsername = ?), SYSDATETIME())", new BatchPreparedStatementSetter() {
        
        public void setValues(PreparedStatement prepStmt, int i) throws SQLException {
          prepStmt.setString(1, newNewsItems.get(i).getNewsTitle());
          prepStmt.setString(2, newNewsItems.get(i).getNewsDesc());
          prepStmt.setString(3, newNewsItems.get(i).getStDate());
          prepStmt.setString(4, newNewsItems.get(i).getEndDate());
          prepStmt.setString(5, req.getUserName());
          prepStmt.setString(6, req.getUserName());
        }
        
        public int getBatchSize() {
          return req.getLstNews().size();
        }
      });
      
      for(int i : count){
        finalCount += i;
      }
      
    } catch(DataAccessException e){
      throw new DAOException("FATAL", e.getMessage());
    }
    return finalCount;
  }
}
