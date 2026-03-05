package com.training.solid.solution.srp.ocp;

public class InterestCalculator {

    public double calculateInterest(InterestPolicy interestPolicy, double balance, int months) {
        return interestPolicy.calculateInterest(balance, months);
    }
}
