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
	public void withdraw (double amount) {
    	if(amount > balance + overdraftLimit) {
    		throw new IllegalArgumentException("Balance not enough!");
    	}
    	balance-=amount;
    	System.out.println("[Current Account] Withdraw Success");
    }
	
	@Override
	public void deposit (double amount) {
    	balance+=amount;
    	System.out.println("[Current Account] Deposit Success");
    }
    
	
	
}
