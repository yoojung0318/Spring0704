// 5. 생성된 리스트를 모두 호출

package com.yoojung0318.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.ex.database.dao.UsedGoodsDAO;
import com.yoojung0318.ex.database.model.UsedGoods;

//비지니스 로직, data 조작
@Service
public class UsedGoodsBO {
	
	@Autowired // spring이 객체를(객체생성) 알아서 관리
	private UsedGoodsDAO usedGoodsDAO;
	
	// used goods 데이터 모두 가져오는 메소드 
	public List<UsedGoods> getUsedGoodsList() {
		
		List<UsedGoods> list = usedGoodsDAO.selectUsedGoodsList();
		// 데이터 조작 
		// 조작 조작 조작
		
		return list;
	}
	

}
