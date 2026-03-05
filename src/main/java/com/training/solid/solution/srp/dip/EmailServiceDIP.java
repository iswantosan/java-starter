package com.training.solid.solution.srp.dip;

public class EmailServiceDIP implements NotifyService {

    @Override
    public void send(String to, String message) {
        System.out.println("[EMAIL to " + to + "] " + message);
    }
}
