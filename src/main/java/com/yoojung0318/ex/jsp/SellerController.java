package com.yoojung0318.ex.jsp;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoojung0318.ex.jsp.bo.SellerBO;
import com.yoojung0318.ex.jsp.bo.UserBO;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {

	@Autowired
	private SellerBO sellerBO;
	
	public String addSeller(
			@Param("nickname") String nickname
			, @Param("profileImage")String profileImage
			, @Param("temperature") double temperature) {
		
		int count = sellerBO.addSeller(nickname, profileImage, temperature);
		return "삽입결과:" + count;
		
	}

}
