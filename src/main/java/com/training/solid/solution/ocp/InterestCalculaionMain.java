package com.training.solid.solution.ocp;

public class InterestCalculaionMain {
    public static void main(String[] args) {
       InterestCalculatorOCPSolution calculatorOCPSolution = new InterestCalculatorOCPSolution();
       
       double balance = 1_000_000;
       int month = 12;

       SavingAccountInterest savingAccountInterest = new SavingAccountInterest();
       double savingInterest = calculatorOCPSolution.calculateInterest(savingAccountInterest, balance, month);
       System.out.println("savingInterest " + savingInterest);
       
       CurrentAccountInterest currentAccountInterest = new CurrentAccountInterest();
       double currentInterest = calculatorOCPSolution.calculateInterest(currentAccountInterest, balance, month);
       System.out.println("interest " + currentInterest);
    }
}
