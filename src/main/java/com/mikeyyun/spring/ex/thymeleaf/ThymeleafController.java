package com.mikeyyun.spring.ex.thymeleaf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/thymeleaf")
@Controller
public class ThymeleafController {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "thymeleaf/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		// 과일 이름 리스트
		List<String> fruitList = new ArrayList<>();
		fruitList.add("lemon");
		fruitList.add("watermelon");
		fruitList.add("banana");
		
		model.addAttribute("fruitList", fruitList);
		
		// 사용자 정보 관리 리스트
		List<Map<String, Object>> userList = new ArrayList<>();
		
		Map<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("name", "엄시윤");
		userMap.put("age", 29);
		userMap.put("hobby", "독서");
		userList.add(userMap);
		
		userMap = new HashMap<>();
		userMap.put("name", "엄시우");
		userMap.put("age", 4);
		userMap.put("hobby", "과자먹기");
		userList.add(userMap);
		
		model.addAttribute("userList", userList);
		
		
		return "thymeleaf/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		
		Date date = new Date();
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		model.addAttribute("date", date);
		model.addAttribute("localDate", localDate);
		model.addAttribute("localDateTime", localDateTime);
		
		return "thymeleaf/ex03";
	}
}
