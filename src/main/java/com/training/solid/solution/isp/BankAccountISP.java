package com.training.solid.solution.isp;

public class BankAccountISP implements Depositable, Withdrawable, Transferable, DebitCardable{

    @Override
    public void issueDebitCard(String cardType) {

    }

    @Override
    public void transfer(com.training.solid.violation.isp.BankAccountISP to, double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposit(double amount) {
    }    
}
