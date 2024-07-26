package com.neha.demo.service;

import com.neha.demo.entity.SocialNetworkPost;
import com.neha.demo.repository.SocialNetworkPostRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialNetworkPostServiceImpl implements SocialNetworkPostService {

 @Autowired
 private SocialNetworkPostRepository socialRepository;

@Override
public List<SocialNetworkPost> fetchList() {
	List<SocialNetworkPost> list = socialRepository.findAll();
//	list.forEach(a->System.out.println(a.getSocialNetworkId()));
	return list;
}

@Override
public List<SocialNetworkPost> findByAuthor(String author) {
	List<SocialNetworkPost> list = socialRepository.findByAuthor(author);
	return list;
}

@Override
public Map<String, List<SocialNetworkPost>> findByPostCategory() {
	List<SocialNetworkPost> list = socialRepository.findAll();
	
	Map<String,List<SocialNetworkPost>> map = list.stream().collect(Collectors.groupingBy(o->o.getPostCategory()));
	
	 Map<String, List<SocialNetworkPost>> topRecords = new HashMap<String, List<SocialNetworkPost>>();
     for (Map.Entry<String, List<SocialNetworkPost>> entry : map.entrySet()) {
         String category = entry.getKey();
         List<SocialNetworkPost> recordList = entry.getValue();
         recordList.sort((r1, r2) -> Integer.compare(r2.getViewCount(), r1.getViewCount()));

         List<SocialNetworkPost> top10 = recordList.stream().limit(10).collect(Collectors.toList());
         topRecords.put(category, top10);
     }
     return topRecords;
}




 
}
