package com.design.patterns.factory;

public class EmailNotification implements Notification {

	@Override
	public String sendNotification() {
		return "Email Notification";
	}



}
