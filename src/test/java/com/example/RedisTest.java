package com.example;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.more.env.EmailService;
import com.example.redis.model.UserModel;
import com.example.redis.service.UserInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

	@Resource
	private UserInfoService us;
	private String id="123";
	
	@Test
	public void addUser() {
		us.delUser(id);
		UserModel userModel = new UserModel();
		userModel.setId(id);
		userModel.setName("test");
		userModel.setPwd("1231");
		us.addUser(userModel);
		System.out.println("add user");
		//Assert.assertSame(userModel.getName(), "test");
		
		userModel=us.getUser(id);
		System.out.println("Get 1 "+userModel);
		userModel=us.getUser(id);
		System.out.println("Get 2 "+userModel);
		userModel.setName("test2");
		System.out.println("NOW 2 "+userModel);
		us.upUser(userModel);
		
		userModel=us.getUser(id);
		System.out.println("Get 3 "+userModel);
		us.delUser(id);
		
		userModel=us.getUser(id);
		System.out.println("Get 4"+userModel);
		//Assert.assertSame(userModel.getName(), "test2");
		
	}

}
