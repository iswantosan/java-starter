package com.training.solid.solution.srp.dip;

public class TransferServiceMain {

    public static void main(String[] args) {

        TransferServiceDIP service = new TransferServiceDIP(new EmailServiceDIP());

        service.transfer("ACC-001", "ACC-002", 100_000);
    }
}