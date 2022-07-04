package com.yoojung0318.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
	 @ResponseBody
	    @RequestMapping("/hello")
	    public String helloWorld() {
	        return "Hello World!!";
	    }
}
