package com.mikeyyun.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikeyyun.spring.ex.database.domain.UsedGoods;
import com.mikeyyun.spring.ex.database.repository.UsedGoodsRepository;

// Logic(Business) responsibility
// Modification to data
// Perform complicated function and so on.
@Service
public class UsedGoodsService {
	
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	
	// Get all the secondhand post
	
	public List<UsedGoods> getUsedGoodsList() {
		
		// Get searched usedgoods table result
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		
		return usedGoodsList;
	}
	
}
