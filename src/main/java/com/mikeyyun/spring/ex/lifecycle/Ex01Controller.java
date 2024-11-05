package com.mikeyyun.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	// 간단한 html 코드 response로 만드는 페이지
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/1")
	public String stringResppnse() {
		return "<h1>예제 1번 문자열에 담기</h1>";
	}
	
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	// 맵 데이터를 response에 담는 페이지
	public Map<String, Integer> mapResponse() {
		// 과일이름 : 가격
		Map<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("사과", 1500);
		fruitMap.put("바나나", 4500);
		fruitMap.put("orange", 1300);
		
		return fruitMap;
	}
}