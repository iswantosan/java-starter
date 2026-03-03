package com.training.solid.violation.srp;

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
        sendEmailNotification("Deposit", amount);
        generateTransactionReport("DEPOSIT", amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
        sendEmailNotification("Withdraw", amount);
        generateTransactionReport("WITHDRAW", amount);
    }

    private void sendEmailNotification(String action, double amount) {
        String subject = "Bank Notification - " + action;
        String body = "Your account " + accountNumber + " " + action.toLowerCase() + " Rp " + amount;
        System.out.println("[EMAIL to " + customerEmail + "] " + subject + ": " + body);
    }

    private void generateTransactionReport(String type, double amount) {
        String report = "REPORT: " + type + " " + amount + " on " + accountNumber;
        System.out.println(report);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
