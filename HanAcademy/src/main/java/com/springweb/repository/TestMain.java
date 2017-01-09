package com.springweb.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestMain {

  
  public static void main1(String[] args) throws SQLException {
    
    String dbURL = "jdbc:sqlserver://localhost\\sqlexpress;integratedSecurity=true;databaseName=HAN;user=ravip;";
    Connection conn = DriverManager.getConnection(dbURL);
    if (conn != null) {
        System.out.println("Connected");
    }
    
  }
  
  public static void main(String[] args) throws SQLException {
    ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/dispatcher-servlet.xml");
    DataSource ds = (DataSource) context.getBean("dataSource");
    String result = null;
    JdbcTemplate jdbcTemplate = null;
    try {

      jdbcTemplate = new JdbcTemplate(ds);
      result = jdbcTemplate.queryForObject("SELECT 'HI FROM DB'", String.class);
      System.out.println("Result: "+result);

    } catch (DataAccessException exception) {
      exception.printStackTrace();

    }

    System.out.println(ds.getLoginTimeout());
  }
}
