package com.mikeyyun.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mikeyyun.spring.ex.mvc.domain.User;

@Mapper
public interface UserRepository {
	
	public int insertUser(
			  @Param("name") String name
			, @Param("birthday") String birthday
			, @Param("email") String email
			, @Param("introduce") String introduce);
	
	public int insertByObject(User user);
	
	public User selectLastUser();
	
	public int countByEmail(@Param("email") String email);
	
}
