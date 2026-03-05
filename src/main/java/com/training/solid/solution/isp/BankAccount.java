package com.training.solid.solution.isp;

public class BankAccount implements BankAccountAble {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    
    public double getBalance() {
    	return this.balance;
    }
    
    public String getaccountNumber() {
    	return this.accountNumber;
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
    public void transfer(BankAccountAble to, double amount) {
        withdraw(amount);
        to.deposit(amount);
    }

   
}
