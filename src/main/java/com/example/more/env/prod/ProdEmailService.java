package com.example.more.env.prod;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.more.env.EmailService;

@Service
@Profile("prod")
public class ProdEmailService implements EmailService {

	@Override
	public void sendMail() {
		System.out.println("this is prod EmailService");

	}

}
