package com.yoojung0318.ex.myBatis.bo;

import com.yoojung0318.ex.myBatis.model.Review;

public class ReviewBO {

	//id가 3인 리뷰 가져오기
	public getReview() {
		
		Review review = reviewDAO.selectReview();
		
	}
}
