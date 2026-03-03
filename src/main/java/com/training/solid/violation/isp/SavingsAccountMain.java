package com.training.solid.violation.isp;

public class SavingsAccountMain {

    public static void main(String[] args) {

        BankAccountISP savings =
                new SavingsAccountISP("SAV-001", 1_000_000);

        System.out.println("=== Normal Operations ===");
        savings.deposit(500_000);
        savings.withdraw(200_000);

        System.out.println("Transfer test...");
        BankAccountISP another =
                new SavingsAccountISP("SAV-002", 0);

        savings.transfer(another, 100_000);

        System.out.println("Done transfer.");
        
        try {
            savings.applyLoan(10_000_000, 12);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}