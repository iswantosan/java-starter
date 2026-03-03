package com.training.solid.violation.dip;

public class EmailServiceDIP {

    public void send(String to, String message) {
        System.out.println("[EMAIL to " + to + "] " + message);
    }
}
