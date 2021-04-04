package com.design.patterns.factory;

public class SmsNotification implements Notification {

	@Override
	public String sendNotification() {
		return "Sms Notification";
	}
}
