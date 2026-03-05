package com.training.oop.model;

public class SavingAccount extends Account{
    private int interest;

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public void withdraw(double amount, String accNo) {
        if(accNo != accountNo)
            throw new IllegalAccessError("Nomor Akun tidak valid");
        if(amount > balance)
            throw new IllegalAccessError("Balance tidak cukup");
        balance -= amount;
        System.out.println("[SavingAccount] - Withdraw success");
    }

    public void deposit(double amount) {}

    public void withdraw(double amount) {}
}
