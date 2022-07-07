package com.yoojung0318.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoojung0318.ex.lifecycle.model.Person;
//@Controller와 @responseBody가 매번 공통적으로 쓰이니까 이걸 따로 기능화한다.
@RestController  // controller + responseBody
@RequestMapping("/lifecycle/ex01")
public class Ex01ResetController {

	@RequestMapping("/3")
	public String printString() {
		return "RestController 테스트";
	}
	@RequestMapping("/4")
	public Person printObject() {
		Person person = new Person();
		person.setName("김인규");
		person.setAge(21);
		
		return person;
	}
	@RequestMapping("/5")
	public ResponseEntity<Person> entity(){
		
		Person person = new Person();
		person.setName("김인규");
		person.setAge(21);
		
		//데이터를 전달할때 response의 status 코드를 추가로 전달
		// 정상 status 코드 : 200  ->ok
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
}
