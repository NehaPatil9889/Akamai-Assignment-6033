package com.neha.demo.service;

import java.util.List;
import java.util.Map;

import com.neha.demo.entity.SocialNetworkPost;

//Interface
public interface SocialNetworkPostService {

 List<SocialNetworkPost> fetchList();

List<SocialNetworkPost> findByAuthor(String author);

Map<String, List<SocialNetworkPost>> findByPostCategory();




}
