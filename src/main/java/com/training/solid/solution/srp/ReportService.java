package com.training.solid.solution.srp;

public class ReportService {

    public void generateReport(String type, String content) {
        String report = "REPORT: " + type + " " + content;
        System.out.println("GENERATE REPORT "
            + type + ": " + content);
    }
}
