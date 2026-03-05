package com.training.solid.solution.ocp;

public class SavingAccountInterest implements InterestPolicy{
    @Override
    public double calculateInterest(double balance, int months) {
        return balance * 0.03 * months / 12;
    }
}
