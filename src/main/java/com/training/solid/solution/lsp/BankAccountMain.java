package com.training.solid.solution.lsp;

public class BankAccountMain {

    public static void main(String[] args) {

        // Method generic yang menerima BankAccountLSP
        BankAccountLSP regularAccount =
                new BankAccountLSP("REG-001", 500);

        BankAccountLSP savingsAccount =
                new SavingsAccountLSP("SAV-001", 500);

        System.out.println("=== Regular Account ===");
        processWithdraw(regularAccount);

        System.out.println("\n=== Savings Account ===");
        processWithdraw(savingsAccount);
    }


    public static void processWithdraw(BankAccountLSP account) {
        System.out.println("Initial balance: " + account.getBalance());

        try {
            account.withdraw(450); 
            System.out.println("Withdraw success.");
            System.out.println("Remaining balance: " + account.getBalance());
        } catch (Exception e) {
            System.out.println("Withdraw failed: " + e.getMessage());
        }
    }
}