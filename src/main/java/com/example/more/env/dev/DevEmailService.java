package com.example.more.env.dev;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.more.env.EmailService;

@Service
@Profile("dev")
public class DevEmailService implements EmailService{

	@Override
	public void sendMail() {
		
		System.out.println("this is dev email serveice.");
		
	}
	
}
