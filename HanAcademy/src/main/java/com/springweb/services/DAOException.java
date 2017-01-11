package com.springweb.services;

public class DAOException extends Exception {
  
  /**
   * 
   */
  private static final long serialVersionUID = 8838520687784112535L;
  private String errCode;
  private String errMsg;
  
  public DAOException(String errCode, String errMsg){
    super();
    this.errCode = errCode;
    this.errMsg = errMsg;
  }

  /**
   * @return the errCode
   */
  public String getErrCode() {
    return errCode;
  }

  /**
   * @param errCode the errCode to set
   */
  public void setErrCode(String errCode) {
    this.errCode = errCode;
  }

  /**
   * @return the errMsg
   */
  public String getErrMsg() {
    return errMsg;
  }

  /**
   * @param errMsg the errMsg to set
   */
  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }
  
}
