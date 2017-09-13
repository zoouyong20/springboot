package com.example.redis.service;

import com.example.redis.model.UserModel;

public interface UserInfoService {

	public UserModel addUser(UserModel userModel);
	
	public UserModel getUser(String id);
	
	public UserModel upUser(UserModel userModel);
	
	public void delUser(String id);
}
