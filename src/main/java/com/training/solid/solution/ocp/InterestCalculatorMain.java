package com.training.solid.solution.ocp;

public class InterestCalculatorMain {

    public static void main (String[] args)
    {


        InterestCalculatorOCP calculator = new InterestCalculatorOCP();

        double balance = 100_000_000;
        int months = 12;

        SavingAccountInterest sv = new SavingAccountInterest();
        CurrentAccountInterest ca = new CurrentAccountInterest();

        calculator.calculateInterest(sv, balance, months);
        calculator.calculateInterest(ca, balance, months);

    }

}
