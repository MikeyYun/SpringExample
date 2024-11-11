package com.mikeyyun.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikeyyun.spring.ex.mybatis.domain.Review;
import com.mikeyyun.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// Get the review information that corresponds to the provided ID.
	public Review getReview(int id) {
		Review review = reviewRepository.selectReview(id);
	// Retrieve the row from the new_review table where the ID matches the provided value.
		
		return review;
	}
	
	// 전달 받은 리뷰 정보를 기반으로 리뷰 저장
	public int addReview(
			int storeId
			, String menu
			, String userName
			, double point
			, String review) {
		
		// 전달 받은 리뷰 내용으로 new_review 테이블에 insert
		
		int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
		
		return count;
	}
	
	// 전달 받은 Review 객체를 통해 저장
	public int addReviewByObject(Review review) {
		
		// 전달 받은 Review 객체로 new_review 에 insert
		int count = reviewRepository.insertReviewByObject(review);
		
		return count;
	}
}