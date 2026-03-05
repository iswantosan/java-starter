package com.training.solid.solution.ocp;

public class SavingAccountInterest implements InterestPolicy{
    @Override
    public double calculateInterest(double balance, int month) {
        return balance * 0.03 * month / 12;
    } 
}
