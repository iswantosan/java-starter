package com.training.solid.solution.isp;

public class SavingsAccountISP implements CoreAccountOps {

    private String accountNumber;
    private double balance;

    public SavingsAccountISP(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    @Override
    public void transfer(CoreAccountOps to, double amount) {
        withdraw(amount);
        to.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
