package com.yoojung0318.ex.myBatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yoojung0318.ex.myBatis.bo.ReviewBO;
import com.yoojung0318.ex.myBatis.model.Review;

@Controller
public class ReviewController {

	@Autowired
	private ReviewBO reviewBO;
	
	//id가 3인 리뷰 가져오기
	public Review review() {
		Review review = reviewBO.getReview();
;		
	}
	
}
