package com.mikeyyun.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// 해당 클래스의 모든 메소드에 @RestController 가 적용된다.
@RestController	// @Controller + ResponseBody
@RequestMapping("/lifecycle/ex01")
public class Ex01RestController {
	
//	@ResponseBody 이미 포함되어 있음
	@RequestMapping("/3")
	// 직접 만든 클래스 객체 리턴
	public Person objectResponse() {
		Person me = new Person("엄시윤", 24);
		
		return me;
	}
	
	@RequestMapping("/4")
	// status code 적용
	public ResponseEntity<Person> entityResponse() {
		
		Person me = new Person("엄시윤", 24);
		
		ResponseEntity<Person> entity = new ResponseEntity(me, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
}
