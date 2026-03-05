package com.training.oop.inheritance;

import com.training.oop.encapsulation.Account;

public class CurrentAccount extends Account {
    private int overDraftLimit;

    public int getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(int overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount > balance + overDraftLimit)
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
