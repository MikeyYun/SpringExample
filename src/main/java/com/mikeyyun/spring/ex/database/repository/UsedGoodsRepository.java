package com.mikeyyun.spring.ex.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mikeyyun.spring.ex.database.domain.UsedGoods;

// Only database
// Mybatis Framework
@Mapper
public interface UsedGoodsRepository {
	
	
	// used_goods table 모든 행 서치
	public List<UsedGoods> selectUsedGoodsList();
	
}
