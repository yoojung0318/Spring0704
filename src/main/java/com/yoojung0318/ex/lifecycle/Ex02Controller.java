package com.yoojung0318.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/lifecycle/ex02/01")
	public String view() {
		return "lifecycle/ex02";
	}
}
