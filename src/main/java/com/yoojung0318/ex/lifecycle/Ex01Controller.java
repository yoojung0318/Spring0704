package com.yoojung0318.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // http response , request 역할
@RequestMapping("/lifecycle/ex01") // 공통된 부분 뽑아서 상위에 만듬
public class Ex01Controller {

	//@RequestMapping("/lifecycle/ex01/1") //url mapping
	@RequestMapping("/1")
	@ResponseBody //http message comforter
	public String printString() {
		return "예제 1번 문자열을 response에 담는다";
	}
	//@RequestMapping("/lifecycle/ex01/2") // url mapping
	@RequestMapping("/2")
	@ResponseBody // 만든 거 되돌려주기 위해 body에 담아서 전송
	public Map<String, Integer> printMap(){
		//과일 이름과 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 3000);
		map.put("orange", 1000);
		
		return map;
	}
}
