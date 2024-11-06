package com.mikeyyun.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mikeyyun.spring.ex.database.domain.UsedGoods;
import com.mikeyyun.spring.ex.database.service.UsedGoodsService;

// It handles about only Request and Response
@Controller
public class UsedGoodsController {
	
	@Autowired
	private UsedGoodsService usedGoodsService;
	
	// Put all the information of used_goods table into Response as json.
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> usedGoodsList() {
		
		// Taking the information about secondhand goods of post.
		List<UsedGoods> usedGoods = usedGoodsService.getUsedGoodsList();
		return usedGoods;
	}
}
