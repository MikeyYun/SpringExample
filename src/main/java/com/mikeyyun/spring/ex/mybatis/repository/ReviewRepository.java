package com.mikeyyun.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mikeyyun.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// Retrieve the review row that matches the provided ID.
	public Review selectReview(@Param("id") int id);
	
	// 전달 받은 리뷰 정보를 기반으로 insert 한다.
	public int insertReview(
			@Param("storeId") int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review);
	
	
}
