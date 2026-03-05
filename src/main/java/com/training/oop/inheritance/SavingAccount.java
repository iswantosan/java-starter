package com.training.oop.inheritance;

import com.training.oop.encapsulation.Account;

public class SavingAccount extends Account {
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double d) {
		this.interestRate = d;
	}
	
	public void deposit (double amount) {
    	balance+=amount + (amount*interestRate);
    	System.out.println("[Saving Account] Deposit Success");
    }
    
    public void withdraw (double amount) {
    	if(amount > balance) {
    		throw new IllegalArgumentException("Balance not enough!");
    	}
    	balance-=amount;
    	System.out.println("[Saving Account] Withdraw Success");
    }
}
