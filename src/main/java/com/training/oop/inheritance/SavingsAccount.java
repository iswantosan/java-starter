package com.training.oop.inheritance;

import com.training.oop.encapsulation.Account;

public class SavingsAccount extends Account {

 private int interestRate;

   

    public int getInterestRate() {
        return interestRate;
    }


    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

}
