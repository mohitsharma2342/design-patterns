package com.design.patterns.factory;

public class TestFactory {

	public static void main(String[] args) {
		Notification notification = NotificationFactory.createNotification(NotificationType.SMS);
		System.out.println(notification.sendNotification());
	
	}
	
}
