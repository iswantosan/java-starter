package com.training.solid.solution.srp;

public class NotificationService {

    public void sendNotification(
            String subject,
            String body,
            String to
    ) {
        System.out.println("[EMAIL to " + to + "] " + subject + ": " + body);
    }
}
