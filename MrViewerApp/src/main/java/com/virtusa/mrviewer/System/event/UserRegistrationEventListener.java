package com.virtusa.mrviewer.System.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.virtusa.mrviewer.System.email.EmailBuilder;

@Component
public class UserRegistrationEventListener {

	@Autowired
	private EmailBuilder emailBuilder;

	@EventListener
	public void onEvent(UserRegistrationEvent event) {
		emailBuilder.setTo(event.getEmail());
		emailBuilder.setSubject("Welcome to Mr.Viewer");
		emailBuilder.setText("Hi ".concat(event.getUsername()).concat(
				"! Your account is successfully created on Mr.Viewer\nEnjoy your favourite movies.\n\nAdmin\nMr.Viewer"));

		emailBuilder.sendMessage();
	}

}
