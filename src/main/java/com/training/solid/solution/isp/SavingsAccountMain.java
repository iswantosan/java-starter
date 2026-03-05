package com.training.solid.solution.isp;

public class SavingsAccountMain {

    public static void main(String[] args) {

        BankAccount savings =
                new BankAccount("SAV-001", 1_000_000);
        System.out.println("balance : "+savings.getBalance());
        System.out.println("=== Normal Operations ===");
        System.out.println("Deposit ...");
        savings.deposit(500_000);
        System.out.println("balance : "+savings.getBalance());
        savings.withdraw(200_000);
        System.out.println("Withdraw...");
        System.out.println("balance : "+savings.getBalance());

        System.out.println("Transfer test...");
        BankAccount another =
                new BankAccount("SAV-002", 0);

        savings.transfer(another, 100_000);

        System.out.println("Done transfer.");
        System.out.println("balance : "+savings.getBalance());
        try {
            savings.transfer(another, 50_000);
            System.out.println("balance : "+savings.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}