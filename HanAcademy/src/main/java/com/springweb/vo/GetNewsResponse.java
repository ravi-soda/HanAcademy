package com.springweb.vo;

import java.util.List;

public class GetNewsResponse {

  private StatusVO status;
  private List<NewsVO> lstNewsVO = null;


  /**
   * @return the status
   */
  public StatusVO getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(StatusVO status) {
    this.status = status;
  }

  public List<NewsVO> getLstNewsVO() {
    return lstNewsVO;
  }

  public void setLstNewsVO(List<NewsVO> lstNewsVO) {
    this.lstNewsVO = lstNewsVO;
  }

}
