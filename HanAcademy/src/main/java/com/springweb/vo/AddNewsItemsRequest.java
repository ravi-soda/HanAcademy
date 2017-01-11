package com.springweb.vo;

import java.util.List;

public class AddNewsItemsRequest {

  private String userName;
  private List<NewsVO> lstNews;

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * @return the lstNews
   */
  public List<NewsVO> getLstNews() {
    return lstNews;
  }

  /**
   * @param lstNews the lstNews to set
   */
  public void setLstNews(List<NewsVO> lstNews) {
    this.lstNews = lstNews;
  }

}
