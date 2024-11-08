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
}