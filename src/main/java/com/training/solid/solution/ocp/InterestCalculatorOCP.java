package com.training.solid.solution.ocp;

public class InterestCalculatorOCP {

    public static final String SAVINGS = "SAVINGS";
    public static final String CURRENT = "CURRENT";
    public static final String FIXED_DEPOSIT = "FIXED_DEPOSIT";

    //close for modification
    public double calculateInterest(InterestPolicy ip, double balance, int months) {
       
        return ip.calculateInterest(balance, months);
    }

}
