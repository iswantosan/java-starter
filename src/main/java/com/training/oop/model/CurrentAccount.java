package com.training.oop.model;

public class CurrentAccount extends Account{
    private double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void withdraw(double amount) {
        if(amount > balance + limit)
            throw new IllegalAccessError("Balance tidak cukup");
        balance -= amount ;
        System.out.println("[CurrentAccount] - Withdraw success");
    }

    public void deposit(double amount) {}
}
