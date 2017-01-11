package com.springweb.vo;

public class NewsVO {
  private String newsTitle;
  private String newsDesc;
  private String stDate;
  private String endDate;
  private String createdDate;
  private String createdBy;
  private String updatedDate;
  private String updatedBy;

  /**
   * @return the newsTitle
   */
  public String getNewsTitle() {
    return newsTitle;
  }

  /**
   * @param newsTitle the newsTitle to set
   */
  public void setNewsTitle(String newsTitle) {
    this.newsTitle = newsTitle;
  }

  /**
   * @return the newsDesc
   */
  public String getNewsDesc() {
    return newsDesc;
  }

  /**
   * @param newsDesc the newsDesc to set
   */
  public void setNewsDesc(String newsDesc) {
    this.newsDesc = newsDesc;
  }

  @Override
  public String toString() {
    return this.newsTitle + ", " + this.newsDesc;
  }

  /**
   * @return the stDate
   */
  public String getStDate() {
    return stDate;
  }

  /**
   * @param stDate the stDate to set
   */
  public void setStDate(String stDate) {
    this.stDate = stDate;
  }

  /**
   * @return the endDate
   */
  public String getEndDate() {
    return endDate;
  }

  /**
   * @param endDate the endDate to set
   */
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * @return the createdDate
   */
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * @param createdDate the createdDate to set
   */
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * @param createdBy the createdBy to set
   */
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * @return the updatedDate
   */
  public String getUpdatedDate() {
    return updatedDate;
  }

  /**
   * @param updatedDate the updatedDate to set
   */
  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * @param updatedBy the updatedBy to set
   */
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

}
