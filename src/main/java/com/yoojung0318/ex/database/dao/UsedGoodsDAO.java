package com.yoojung0318.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yoojung0318.ex.database.model.UsedGoods;

// 데이터 조작, interface로 구현, 1.메소드 호출, 4.list에 저장
@Repository
public interface UsedGoodsDAO {
	
	// used goods 에서 모든 데이터 조회
	public List<UsedGoods> selectUsedGoodsList();

}
