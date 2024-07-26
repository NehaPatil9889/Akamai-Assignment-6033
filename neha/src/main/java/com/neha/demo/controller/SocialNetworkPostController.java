package com.neha.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neha.demo.entity.SocialNetworkPost;
import com.neha.demo.service.SocialNetworkPostService;

@RestController
@RequestMapping("/SocialNetwork")
public class SocialNetworkPostController {

 @Autowired private SocialNetworkPostService socialNetworkService;

 @RequestMapping(value = "/findAll",  method = RequestMethod.GET)
 public List<SocialNetworkPost> findAll() throws Exception {
	java.util.List<SocialNetworkPost> lst = socialNetworkService.fetchList();
		
	return lst;
				
}
 
 @RequestMapping(value = "/findByAuthor", method = RequestMethod.GET)
 public List<SocialNetworkPost> findByAuthor(
			@RequestParam("author") String author) throws Exception {
	List<SocialNetworkPost> lst = socialNetworkService.findByAuthor(author);
		
	return lst;
 }

 @RequestMapping(value="/topViewCount", method = RequestMethod.GET)
 public Map<String,List<SocialNetworkPost>> topviewCount(){
	 
    Map<String, List<SocialNetworkPost>> map = socialNetworkService.findByPostCategory();
	return map;
	 
 }

}