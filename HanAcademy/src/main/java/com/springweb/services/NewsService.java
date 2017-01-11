package com.springweb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.repository.NewsRepository;
import com.springweb.vo.AddNewsItemsRequest;
import com.springweb.vo.AddNewsItemsResponse;
import com.springweb.vo.GetNewsResponse;
import com.springweb.vo.NewsVO;
import com.springweb.vo.StatusVO;

@Service
public class NewsService {

  @Autowired
  private NewsRepository newsRepo;
  
  public GetNewsResponse getAllNews() {
    List<NewsVO> lstNewsVO = null;
    StatusVO status = new StatusVO();
    GetNewsResponse resp = new GetNewsResponse();
    try{
      lstNewsVO = newsRepo.getAllNews();
      if(null != lstNewsVO && lstNewsVO.size()> 0){
        status.setStatusCode("SUCCESS");
        status.setStatusMessage("Successfully fetched all news Items.");
        resp.setLstNewsVO(lstNewsVO);
        resp.setStatus(status);
      } else {
        status.setStatusCode("SUCCESS");
        status.setStatusMessage("No News Items found.");
        resp.setLstNewsVO(new ArrayList<NewsVO>());
        resp.setStatus(status);
      }
    } catch (DAOException e) {
      status.setStatusCode("FAIL");
      status.setStatusMessage("FAILED fetching all news Items.");
      resp.setLstNewsVO(new ArrayList<NewsVO>());
      resp.setStatus(status);
    }
    return resp;
  }

  public AddNewsItemsResponse addNewNewsItems(AddNewsItemsRequest request) {
    int count = 0;
    StatusVO status = new StatusVO();
    AddNewsItemsResponse resp = new AddNewsItemsResponse();
    try {
      count = newsRepo.addNewsItems(request);
      if(count > 0){
        status.setStatusCode("SUCCESS");
        status.setStatusMessage("Successfully inserted new news Items.");
        resp.setStatus(status);
      } else {
        status.setStatusCode("SUCCESS");
        status.setStatusMessage("No News Items added to database.");
        resp.setStatus(status);
      }
    } catch (DAOException e) {
      status.setStatusCode("FAIL");
      status.setStatusMessage("FAILED adding new news Items in database.");
      resp.setStatus(status);
    }
    return resp;
  }

  /* get news */

  /* add new news item */

  /* delete news item */

}
