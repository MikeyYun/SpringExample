package com.mikeyyun.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikeyyun.spring.ex.mybatis.domain.Review;
import com.mikeyyun.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// Get the review information with and ID of 5
	public Review getReview() {
		Review review = reviewRepository.selectReview();
		// Retrieve the row with ID 5 from the new_review table
		
		return review;
	}
}
