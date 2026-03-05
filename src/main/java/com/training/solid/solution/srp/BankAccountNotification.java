package com.training.solid.solution.srp;

public class BankAccountNotification {    
        public void sendEmailNotification(
            String subject,
            String body,
            String to
        ) {
        System.out.println("[EMAIL to " + to + "] " + subject + ": " + body);
    }
}
