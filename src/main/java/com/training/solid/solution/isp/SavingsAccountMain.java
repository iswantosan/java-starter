package com.training.solid.solution.isp;

public class SavingsAccountMain {

    public static void main(String[] args) {

        CoreAccountOps savings =
                new SavingsAccountISP("SAV-001", 1_000_000);

        System.out.println("=== Normal Operations ===");
        savings.deposit(500_000);
        savings.withdraw(200_000);

        System.out.println("Transfer test...");
        CoreAccountOps another =
                new SavingsAccountISP("SAV-002", 0);

        savings.transfer(another, 100_000);

        System.out.println("Done transfer.");
    }
}