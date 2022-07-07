package com.yoojung0318.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoojung0318.ex.database.bo.UsedGoodsBO;
import com.yoojung0318.ex.database.model.UsedGoods;


// controller는 만들어놓은거 가져와서 전달만함
@Controller
public class UsedGoodsController {
	
	@Autowired // 객체 알아서 관리
	private UsedGoodsBO usedGoodsBO;
	
	// used goods 안에 있는 모든 내용을 json 으로 전달한다. 
	@RequestMapping("/database/ex01/01")
	@ResponseBody
	public List<UsedGoods> ex01() {
		
		List<UsedGoods> list = usedGoodsBO.getUsedGoodsList();
		
		return list;
	}
}