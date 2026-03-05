package com.training.solid.solution.ocp;

public class InterestCalculatorMain {

    public static void main(String[] args) {

        InterestCalculator calculator = new InterestCalculator();

        double balance = 100_000_000;
        int months = 12;
        
        SavingAccountInterest acc1 = new SavingAccountInterest();
        
        System.out.println("Interest Saving Account: "+calculator.calculateInterest(acc1, balance, months));
        
        CurrentAccountInterest acc2 = new CurrentAccountInterest();
        
        System.out.println("Interest Current Account: "+calculator.calculateInterest(acc2, balance, months));

        VipAccountInterest acc3 = new VipAccountInterest();
        
        System.out.println("Interest VIP Account: "+calculator.calculateInterest(acc3, balance, months));
    }
}