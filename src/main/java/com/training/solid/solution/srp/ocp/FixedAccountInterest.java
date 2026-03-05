package com.training.solid.solution.srp.ocp;

public class FixedAccountInterest implements InterestPolicy {

    @Override
    public double calculateInterest(double balance, int months) {
        return balance * 0.06 * months / 12;
    }
    
}
