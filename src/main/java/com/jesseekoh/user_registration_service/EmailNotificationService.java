package com.jesseekoh.user_registration_service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending email to " + recipientEmail + " with message: " + message);
    }

}
