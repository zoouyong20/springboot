package com.example.more.env.test;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.more.env.EmailService;

@Service
@Profile("test")
public class TestEmailService implements EmailService {

	@Override
	public void sendMail() {
		System.out.println("this test envi send email");
	}

}
