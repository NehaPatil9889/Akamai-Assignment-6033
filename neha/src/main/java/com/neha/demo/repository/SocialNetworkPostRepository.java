package com.neha.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.neha.demo.entity.SocialNetworkPost;

@Repository

//Interface extending CrudRepository
public interface SocialNetworkPostRepository
 extends JpaRepository<SocialNetworkPost, Long> {
	
	 @Query(value = "SELECT * FROM SOCIAL_NETWORK_POST  s WHERE  s.AUTHOR =:author", nativeQuery = true)
	  List<SocialNetworkPost> findByAuthor(@Param("author") String author);
}
