package com.yoojung0318.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.ex.jsp.dao.SellerDAO;
import com.yoojung0318.ex.jsp.dao.UserDAO;

@Service
public class SellerBO {
	@Autowired //spring에서 알아서 객체 생성 즉, 생성된 객체를 활용하기만 하면 됨 , private사용
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickname, String profileImage, double temperature) {
		
		return sellerDAO.insertUser(nickname, profileImage, temperature);
	}
}
