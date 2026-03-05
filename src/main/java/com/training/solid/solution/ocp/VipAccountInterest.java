package com.training.solid.solution.ocp;

public class VipAccountInterest implements InterestPolicy {
	@Override
	public double calculateInterest(double balance, int months) {
		return balance * 0.05 * months / 12;
	}
}
