package com.yoojung0318.ex.myBatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yoojung0318.ex.myBatis.model.Review;

@Repository
public interface ReviewDAO {

	//new_reivew 테이블에서 id=3 인 리뷰 가져오기
	//재료 준비
	public Review selectReview(@Param("id") int id);

}
