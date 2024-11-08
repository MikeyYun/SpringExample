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
@RequestMapping("/mybatis/review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// Return the review information with an ID of 5 in the response as JSON.
	@RequestMapping("/review")
	@ResponseBody
	public Review review (@RequestParam("id")int id) {
		
		// Get the review information with ID 5.
		Review review = reviewService.getReview(id);
		
		return review;
		
	}
	
	// 리뷰 내용을 저장하는 기능
	@ResponseBody
	@RequestMapping("/create")
	public String createReview() {
		
		// 4, 치즈피자, 엄시윤, 4.5, 치즈피자 존맛탱구리!!
		int count = reviewService.addReview(4, "고구마피자", "엄시윤", 5.0, "와앙 존맛탱구리!!");	
		
		return "삽입 결과 : " + count ;
	}
}
