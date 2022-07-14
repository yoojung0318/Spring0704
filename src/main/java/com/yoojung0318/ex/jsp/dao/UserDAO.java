package com.yoojung0318.ex.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yoojung0318.ex.jsp.model.User;

@Repository
public interface UserDAO {
	//파라미터로 전달받은 값 insert, xml에서도 이거 그대로 사용하니까 param처리 (xml에서 사용하려면 param처리 해야함)
	public int insertUser(
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("introduce") String introduce
			, @Param("email") String email);
	
	//가장 최근 등록되니 사용자 정보 조회
	public User selectLastUser();
	
	public int insertUserWithId(User user);
	
}
