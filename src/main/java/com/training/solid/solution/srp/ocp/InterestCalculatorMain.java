package com.training.solid.solution.srp.ocp;

public class InterestCalculatorMain {

    public static void main(String[] args) {

        InterestCalculator calculator = new InterestCalculator();

        double balance = 100_000_000;
        int months = 12;

        SavingAccountInterest acc1 = new SavingAccountInterest();
        double Interest = calculator.calculateInterest(acc1, balance, months);
        System.out.println("Interest: " + Interest);

        CurrentAccountInterest acc2 = new CurrentAccountInterest();
        Interest = calculator.calculateInterest(acc2, balance, months);
        System.out.println("Interest: " + Interest);

    }
}