package com.training.solid.solution.dip;

public class EmailServiceDIP implements NotifyService {

    @Override
    public void sendEmail(String to, String message) {
        System.out.println("[EMAIL to " + to + "] " + message);
    }


}
