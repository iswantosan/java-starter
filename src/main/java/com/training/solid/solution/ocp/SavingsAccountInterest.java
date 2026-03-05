package com.training.solid.solution.ocp;


class SavingAccountInterest implements InterestPolicy
{

    @Override
    public double calculateInterest(double balance, int months) {
        // TODO Auto-generated method stub
        return balance * 0.03 * months / 12;
    }

    
}