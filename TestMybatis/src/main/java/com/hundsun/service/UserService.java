package com.hundsun.service;

import java.util.List;

import com.hundsun.model.User;

public interface UserService {

	public User getUserById(int userId);
	
	List<User> findAll();

	int deleteByPrimaryKey(Integer id);

	int insertUser(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

}
