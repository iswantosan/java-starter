package com.training.solid.solution.ocp;

public class FixedAccountInterest implements InterestPolicy{
    @Override
    public double calculateInterest(double balance, int month) {
        return balance * 0.06 * month / 12;
    }
}
