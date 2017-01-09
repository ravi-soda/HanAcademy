package com.springweb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Repository
public class SampleRepository {

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Autowired
  TransactionTemplate tranxTemplate;

  @SuppressWarnings("null")
  public void execQuery() {

    String result;
    JdbcTemplate jdbcTemplate = null;
    try {

      //jdbcTemplate = new JdbcTemplate(this.excaliburDS);
      result = jdbcTemplate.queryForObject("SELECT 'HI FROM DB'", String.class);
      System.out.println("Result: " + result);

    } catch (DataAccessException exception) {
      exception.printStackTrace();
    }
  }

  public void addItem() {
    tranxTemplate.execute(new TransactionCallbackWithoutResult() {
      @Override
      protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
        try {
          String sql =
              "INSERT INTO HAN.TESTDB.ADMIN_USER (adminUserID, adminUsername, adminPassword, createdDate) VALUES (?, ?, ?, SYSDATETIME());";
          jdbcTemplate.update(sql, new Object[] {4, "RAVI",
              "password"});
        } catch (Exception e) {
          transactionStatus.setRollbackOnly();
        }
      }
    });
  }
}
