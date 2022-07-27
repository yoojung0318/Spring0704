package com.yoojung0318.ex.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.ex.ajax.dao.NewUserDAO;
import com.yoojung0318.ex.ajax.model.NewUser;

@Service
public class NewUserBO {
	
	@Autowired
	private NewUserDAO newUserDAO;
	
	// new_user 테이블 모든 내용 얻어오기 
	public List<NewUser> getUserList() {
		return newUserDAO.selectUserList();
	}
	
	public int addUser(String name, String birthday, String introduce, String email) {
		return newUserDAO.insertUser(name, birthday, introduce, email);
	}
	
	public boolean isDuplicateName(String name) {
//		int count = newUserDAO.selectCountByName(name);
		
//		if(count == 0) { // 중복되지 않음
//			return false;
//		} else { // 중복됨
//			return true;
//		}
		
//		return count != 0;
		
		return newUserDAO.selectCountByName(name) != 0;
		
	}

}
