package com.example.dubbo;

public class UserServiceImpl implements UserService {

	@Override
	   public String getUserName() {
        System.out.println("Being invoked");
        return "test user";
    }

}
