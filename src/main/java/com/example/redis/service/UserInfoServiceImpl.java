package com.example.redis.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.redis.model.UserModel;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Override
	@CachePut(value="userModel",key="#userModel.id")
	public UserModel addUser(UserModel userModel) {
		System.out.println("================== add user to db ===================");
		return userModel;
	}

	@Override
	@Cacheable(value="userModel",key="#id") //缓存,这里没有指定key
	public UserModel getUser(String id) {
		System.out.println("================== no cach for "+id+"===================");
		System.out.println("================== get user from db ====================");
		UserModel userModel = new UserModel();
		userModel.setId(id);
		return userModel;
	}

	@Override
	@CachePut(value="userModel",key="#userModel.id")
	public UserModel upUser(UserModel userModel) {
		System.out.println("================== update user to db ===================");;
		return userModel;
	}

	@Override
	@CacheEvict(value="userModel",key="#id")
	public void delUser(String id) {
		System.out.println("================== delete user to db ===================");
	}

}
