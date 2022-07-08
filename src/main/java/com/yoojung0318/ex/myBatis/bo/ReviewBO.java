package com.yoojung0318.ex.myBatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.ex.myBatis.dao.ReviewDAO;
import com.yoojung0318.ex.myBatis.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	// id가 3인 리뷰 가져오기 
	public Review getReview(int id) {
		
		Review review = reviewDAO.selectReview(id);
		
		return review;
		
	}
}
