package com.training.solid.solution.srp;

public class BankAccountSolution {

    private String accountNumber;
    private double balance;

    public BankAccountSolution(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
        System.out.println("Deposit Success");
        // sendEmailNotification("Deposit", amount);
        // generateTransactionReport("DEPOSIT", amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
        // sendEmailNotification("Withdraw", amount);
        // generateTransactionReport("WITHDRAW", amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
