package com.training.oop.inheritance;

import com.training.oop.encapsulation.Account;

public class SavingAccount extends Account {

    private int interestRate;

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited: %s%n", amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough balance!");
        }

        balance -= amount;
        System.out.printf("Withdrawn: %s%n", amount);
    }
}
