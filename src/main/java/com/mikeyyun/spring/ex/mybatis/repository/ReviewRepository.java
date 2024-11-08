package com.mikeyyun.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mikeyyun.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// Retrieve the review row that matches the provided ID.
	public Review selectReview(@Param("id") int id);
	
}
