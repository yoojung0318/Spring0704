package com.yoojung0318.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoojung0318.ex.jsp.bo.UserBO;
import com.yoojung0318.ex.jsp.model.User;

@Controller
@RequestMapping("/jsp/user")
public class Usercontroller {
	
	@Autowired
	private UserBO userBO;
	//사용자가 파라미터를 통해서 전달한 데이터로 사용자 정보 저장
	@ResponseBody
	//@RequestMapping("/jsp/user/insert"): 기본형태-> get
	@PostMapping("/insert") //post page
	//introduce, email null 가능
	public String addUser(
			@RequestParam("name") String name
			,@RequestParam("yyyymmdd") String yyyymmdd  
			,@RequestParam(value="introduce", required=false) String introduce
			,@RequestParam(value="email", required=false) String email) {
		
		int count = userBO.addUser(name, yyyymmdd, introduce, email);
		return "삽입결과:" + count;
	}
	//jsp 연결
	@GetMapping("/input_view") //get page
	public String userInputView() {
		
		return"jsp/userInput"; //jsp폴더 / userInput 파일
		
	}
	
	//메소드 이름으로 연결 , 기본: getmapping
	@GetMapping("/info")
	//model: 알아서 생성되는 매개체, 여기에 만든 값 넣어서 사용
	public String userInfo(Model model) {
		//가장 최신의 사용자 정보
		
		User user = userBO.getLastUser();
		model.addAttribute("result", user);
		
		return "jsp/userInfo";
		
	}
}
