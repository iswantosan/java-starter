package com.training.solid.violation.ocp;

import com.training.solid.solution.ocp.InterestCalculatorOCP;

public class InterestCalculatorMain {

    public static void main(String[] args) {

        InterestCalculatorOCP calculator = new InterestCalculatorOCP();

        double balance = 100_000_000;
        int months = 12;

        /*System.out.println("Savings Interest: " +
                calculator.calculateInterest(InterestCalculatorOCP.SAVINGS, balance, months));

        System.out.println("Current Interest: " +
                calculator.calculateInterest(InterestCalculatorOCP.CURRENT, balance, months));

        System.out.println("Fixed Deposit Interest: " +
                calculator.calculateInterest(InterestCalculatorOCP.FIXED_DEPOSIT, balance, months));

        // 🔥 Case baru
        System.out.println("Premium Interest: " +
                calculator.calculateInterest("PREMIUM", balance, months));*/
    }
}