package com.yoojung0318.ex.myBatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoojung0318.ex.myBatis.bo.ReviewBO;
import com.yoojung0318.ex.myBatis.model.Review;

@Controller
public class ReviewController {

	@Autowired
	private ReviewBO reviewBO;
	
	// id가 3인 리뷰 가져오기
	// /mybatis/ex01/1?id=8
	@ResponseBody
	@RequestMapping("/mybatis/ex01/01")
	public Review review(
//			@RequestParam("id") int id
//			@RequestParam(value="id", required=true) int id
//			@RequestParam(value="id", required=false) int id
			@RequestParam(value="id", defaultValue="1") int id
			
			) {
		Review review = reviewBO.getReview(id);
		
		return review;
		
	}

	
}
