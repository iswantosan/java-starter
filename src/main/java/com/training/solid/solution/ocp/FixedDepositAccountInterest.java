package com.training.solid.solution.ocp;

public class FixedDepositAccountInterest implements InterestPolicy {
	@Override
	public double calculateInterest(double balance, int months) {
		return balance * 0.06 * months / 12;
	}
}
