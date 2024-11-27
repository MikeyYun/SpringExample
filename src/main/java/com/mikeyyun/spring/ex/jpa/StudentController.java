package com.mikeyyun.spring.ex.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mikeyyun.spring.ex.jpa.domain.Student;
import com.mikeyyun.spring.ex.jpa.repository.StudentRepository;
import com.mikeyyun.spring.ex.jpa.service.StudentService;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	// 절대 Controller 에서 Repository 활용 금지!!!! (이건 연습하는 거기 때문에 잠시 사용)
	@Autowired
	private StudentRepository studentRepository;
	
	// create update delete
	
	// 한 학생의 정보를 저장하는 기능
	@ResponseBody
	@GetMapping("/create")
	public Student createStudent() {
		// 엄시윤 010-2001-6494 happiness010108@gmail.com 개발자
		Student student = studentService.addStudent("엄시윤", "010-2001-6494", "hap@gmail.com", "개발자");
		
		return student;
	}
	
	@ResponseBody
	@GetMapping("/update")
	public Student updateStudent() {
		// id가 1인 장래희망을 다른 걸로 변경
		Student student = studentService.updateStudent(1, "창업가");
		
		return student;
	}
		
	@ResponseBody
	@GetMapping("/delete")
	public String deleteStudent() {
		
		// id 가 3인 행 정보 삭제
		studentService.deleteStudet(9);
		return "삭제!!";
	}
	
	@ResponseBody
	@GetMapping("/find")
	public List<Student> findStudent() {
		
		List<Student> studentList = null;
		// 모든 행 조회
//		List<Student> studentList = studentRepository.findAll();
		
		// 모든 행을 id column 내림 차순으로 조회
		
//		studentList = studentRepository.findAllByOrderByIdDesc();
		
//		studentList = studentRepository.findTop5ByOrderByIdDesc();
		
//		studentList = studentRepository.findByName("엄시윤");
		
//		List<String> nameList = new ArrayList<>();
//		nameList.add("엄시우");
//		
//		studentList = studentRepository.findByNameIn(nameList);
		
//		studentList = studentRepository.findByEmailContaining("hap");
		
//		studentList = studentRepository.findByIdBetweenOrderByIdDesc(1, 4);
		
		studentList = studentRepository.selectByDreamJob("개발자");
		
		return studentList;
		
	}
	
	
	@ResponseBody
	@GetMapping("/lombok")
	public Student lombokTest() {
		
//		Student student = new Student(1 , "엄시윤" , "010-2001-6494" , "happiness010108@gmail.com" , "개발자" , null , null);
//		student.setName("엄시윤");
//		student.setEmail("euomeuom@naver.com");
//		student.setPhoneNumber("010-2001-6494");
		
		Student student = Student.builder()
				.name("엄시윤")
				.email("happiness010108@gmail.com")
				.phoneNumber("010-2001-6494")
				.build();
		
		return student;
	}
	
}
