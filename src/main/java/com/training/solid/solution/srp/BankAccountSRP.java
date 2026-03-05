package com.training.solid.solution.srp;

public class BankAccountSRP {

    private String accountNumber;
    private String customerEmail;
    private double balance;

    public BankAccountSRP(String accountNumber, String customerEmail, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerEmail = customerEmail;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }


    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getEmail() {
    	return customerEmail;
    }
}
