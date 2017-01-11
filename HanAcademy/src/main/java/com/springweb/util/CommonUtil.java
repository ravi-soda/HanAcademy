package com.springweb.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.json.GsonBuilderUtils;

import com.google.gson.Gson;
import com.springweb.vo.AddNewsItemsRequest;
import com.springweb.vo.NewsVO;

public class CommonUtil {
  
  public static void main(String[] args) {
    
    NewsVO news = new NewsVO();
    List<NewsVO> lstNews = new ArrayList<NewsVO>();
    AddNewsItemsRequest req = new AddNewsItemsRequest();
    
    news.setNewsTitle("xyz");
    news.setNewsDesc("xyz");
    lstNews.add(news);
    
    req.setLstNews(lstNews);
    req.setUserName("SCOTT");
    
    Gson gson = new Gson();
    String jsonStr = gson.toJson(req);
    System.out.println("JSON: "+jsonStr);
  }

}
