package com.training.solid.solution.srp;

public class BankAccountReport {
    public void generateTransactionReport(String type, String content) {
        String report = "REPORT: " + type + " with Content" + content;
        System.out.println(report);
    }
}
