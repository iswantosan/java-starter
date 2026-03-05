package com.training.solid.solution.ocp;

public class InterestCalculatorMain {

    public static void main(String[] args) {

        final double balance = 100_000_000;
        final int months = 12;

        final InterestCalculator calculator = new InterestCalculator();

        final double interest = calculator.calculateInterest(
                new SavingAccountInterest(),
                balance,
                months
        );

        System.out.printf(
                "Interest: %s%n",
                interest
        );
    }
}
