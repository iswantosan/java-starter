package com.training.solid.solution.srp;

class ReportService {

    public void generateTransactionReport(String type, String content) {
        String report = "GENERATE REPORT: " + type + " Content: " + content;
        System.out.println(report);
    }
}
