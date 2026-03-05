package com.training.solid.solution.srp;

class NotificationService {

   public  void sendEmailNotification(String subject, String body, String customerEmail) {
         
       
        System.out.println("[EMAIL to " + customerEmail + "] " + subject + ": " + subject + " BODY: " + body);
    }


}
