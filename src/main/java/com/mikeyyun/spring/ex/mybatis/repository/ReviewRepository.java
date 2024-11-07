package com.mikeyyun.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.mikeyyun.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// Retrieve the row with ID 5.
	public Review selectReview();
	
}
