package com.training.solid.solution.srp;

public class ReportService {
    public void generateReport(String type, String content) {
        String report = "Generate Report: " + type + " " + content;
        System.out.println(report);
    }
}
