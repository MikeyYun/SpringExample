package com.mikeyyun.spring.ex.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mikeyyun.spring.ex.mybatis.domain.Review;
import com.mikeyyun.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// Return the review information with an ID of 5 in the response as JSON.
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review (@RequestParam("id")int id) {
		
		// Get the review information with ID 5.
		Review review = reviewService.getReview(id);
		
		return review;
		
	}
}
