package com.training.solid.solution.ocp;

public class InterestCalculatorOCPSolution {

    public double calculateInterest(InterestPolicy interestPolicy, double balance, int month) {
       return interestPolicy.calculateInterest(balance, month);
    }
}
