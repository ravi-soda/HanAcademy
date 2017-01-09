package com.springweb.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.repository.SampleRepository;

@RestController
@RequestMapping("/restful")
public class SampleRestController {

  @Autowired
  SampleRepository repo ;
  
  @RequestMapping(method=RequestMethod.GET, value="/hello" )
  public String sayHello(){
    
    repo.execQuery();
    return "Hello restful";
  }
  
  @RequestMapping(method=RequestMethod.GET, value="/adduser" )
  public String addUser(){
    
    repo.addItem();
    return "added User";
  }
}
