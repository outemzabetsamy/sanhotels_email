package com.sanhotels.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.sanhotels.email.service.EmailServiceSender;

@SpringBootApplication
public class EmailApplication {
	
	@Autowired
	private EmailServiceSender service;
	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		service.sendSimpleEmail("nary.mahiout@gmail.com","Test spring boot email ","Test Application");
	}
}
