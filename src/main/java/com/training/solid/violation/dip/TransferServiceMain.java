package com.training.solid.violation.dip;

public class TransferServiceMain {

    public static void main(String[] args) {

        TransferServiceDIP service = new TransferServiceDIP();

        service.transfer("ACC-001", "ACC-002", 100_000);
    }
}