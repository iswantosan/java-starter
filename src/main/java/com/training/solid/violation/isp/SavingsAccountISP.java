package com.training.solid.violation.isp;

public class SavingsAccountISP implements BankAccountISP {

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
    public void transfer(BankAccountISP to, double amount) {
        withdraw(amount);
        to.deposit(amount);
    }

    @Override
    public void applyLoan(double amount, int tenureMonths) {
        throw new UnsupportedOperationException("Savings account does not support loans");
    }

    @Override
    public void issueDebitCard(String cardType) {
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
