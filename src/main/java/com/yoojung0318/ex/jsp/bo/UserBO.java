package com.yoojung0318.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.ex.jsp.dao.UserDAO;
import com.yoojung0318.ex.jsp.model.User;

@Service
public class UserBO {
	@Autowired //spring에서 알아서 객체 생성 즉, 생성된 객체를 활용하기만 하면 됨 , private사용
	private UserDAO userDAO;
	//전달 받은 거 보여주기
	public int addUser(String name, String yyyymmdd, String introduce, String email) {
		return userDAO.insertUser(name, yyyymmdd, introduce, email);
	}
	
	//가장 최신 등록된 사용자 정보
	public User getLastUser() {
		return userDAO.selectLastUser();
	}
	
	public int addUserWithID(User user) {
//		User user = new User();
//		user.setName(name);
//		user.setYyyymmdd(yyyymmdd);
//		user.setIntroduce(introduce);
//		user.setEmail(email);
		return userDAO.insertUserWithId(user);
		
	}
}
