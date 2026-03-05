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

    @Override
    public void withdraw(double amount){
        if(amount > balance + interestRate)
            throw new IllegalArgumentException("Balance not enough");
        balance -= amount;
        System.out.println("[Current Account] - Withdraw success");
    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit success");
    }
}
