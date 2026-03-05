package com.training.solid.solution.isp;

public interface BankAccountISP {

    void deposit(double amount);
    void withdraw(double amount);
    void transfer(BankAccountISP to, double amount);
    void applyLoan(double amount, int tenureMonths);
    void issueDebitCard(String cardType);
}
