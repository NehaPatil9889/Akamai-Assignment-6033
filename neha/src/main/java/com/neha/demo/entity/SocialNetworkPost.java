package com.neha.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SocialNetworkPost {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    
   private Long socialNetworkId;
    private Date postDate;
    private String postCategory;
    private String author;
    private String content;
    private Integer viewCount;
    
	public SocialNetworkPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getSocialNetworkId() {
		return socialNetworkId;
	}


	public void setSocialNetworkId(Long socialNetworkId) {
		this.socialNetworkId = socialNetworkId;
	}


	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getPostCategory() {
		return postCategory;
	}
	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
    
    
}