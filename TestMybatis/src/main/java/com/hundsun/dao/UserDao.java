package com.hundsun.dao;

import java.util.List;

import com.hundsun.model.User;

public interface UserDao {
	int insertSelective(User record);
	
	User selectByPrimaryKey(Integer id);
	
	int deleteByPrimaryKey(Integer id);
	
	List<User> findAll();

	int insertUser(User record);


	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}