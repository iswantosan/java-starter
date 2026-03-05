package com.training.solid.solution.ocp;

public class InterestCalculator {

	public static final String SAVINGS = "SAVINGS";
    public static final String CURRENT = "CURRENT";
    public static final String FIXED_DEPOSIT = "FIXED_DEPOSIT";

    public double calculateInterest(InterestPolicy policy, double balance, int months) {
       return policy.calculateInterest(balance, months);
    }
	
}