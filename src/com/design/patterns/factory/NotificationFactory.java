package com.design.patterns.factory;

public class NotificationFactory {

	public static Notification createNotification(NotificationType notifyType) {
		Notification notification = null;
		switch (notifyType) {
		case EMAIL:
			notification = new EmailNotification();
			break;
		case SMS:
			notification = new SmsNotification();
			break;

		default:
			break;
		}
		return notification;
	}
	

}
