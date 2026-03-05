package com.training.oop.inheritance;

import com.training.oop.encapsulation.Account;

public class CurrentAccount extends Account {

    private int overdraftLimit;

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {

        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw (double amount){

        if (amount > balance + overdraftLimit)
            throw new IllegalArgumentException("gak cukup limitnya cok");
        balance -= amount;
        System.out.println("[current acc] withdraw success, balance: " + balance);


    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub

        balance += amount;
        System.out.println("deposit success: "); 
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
    

}
