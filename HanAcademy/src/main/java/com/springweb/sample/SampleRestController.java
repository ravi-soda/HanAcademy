package com.springweb.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.repository.SampleRepository;
import com.springweb.services.NewsService;
import com.springweb.vo.AddNewsItemsRequest;
import com.springweb.vo.AddNewsItemsResponse;
import com.springweb.vo.GetNewsResponse;

@RestController
@RequestMapping("/restful")
public class SampleRestController {

  @Autowired
  SampleRepository repo ;
  
  @Autowired
  private NewsService newsService;
  
  
  @RequestMapping(method=RequestMethod.GET, value="/hello", produces=MediaType.ALL_VALUE )
  public String sayHello(){
    
    repo.execQuery();
    return "Hello restful";
  }
  
  
  @RequestMapping(method=RequestMethod.GET, value="/adduser" )
  public String addUser(){
    
    repo.addItem();
    return "added User";
  }

  // getNews
  @RequestMapping(method=RequestMethod.GET, value="/getnews", produces=MediaType.APPLICATION_JSON_VALUE )
  public GetNewsResponse getNews(){
    GetNewsResponse newsResp = newsService.getAllNews();
    return newsResp;
  }
  
  // add news
  @RequestMapping(method=RequestMethod.POST, value="/addnews", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE )
  public AddNewsItemsResponse addNews(@RequestBody AddNewsItemsRequest request){
    AddNewsItemsResponse resp = newsService.addNewNewsItems(request);
    return resp;
  }
  
  // getAvailSchedules
  // getCourseDetails
  // addNewChild
  // getChildrenByParent
  // registerForCourses
  // getAllRegsByParent

  // addInteraction
}
