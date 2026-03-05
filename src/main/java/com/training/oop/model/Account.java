package com.training.oop.model;

// encapsulation -> class lain tidak bisa mengetahui function atau method apa saja yang class Account ini punya atau diproses
// public class Account {

public abstract class Account {
    // encapsulation -> pakai private
    // private int id;
    // private String accountNo;
    // private double balance;

    // inheratance -> pakai protected
    protected int id;
    protected String accountNo;
    protected double balance;

    // setter dan getter
    // setter dipakai untuk set nilai 
    // getter untuk memanggil atau menampilkan nilai

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0) 
            // checked exception && unchecked exception
            throw new IllegalAccessError("Balance tidak boleh kurang dari 0");
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount ;
        System.out.println("Deposit success");
    }

    public abstract void withdraw(double amount);

    // public void deposit(double amount) {
    //     balance += amount ;
    //     System.out.println("Deposit success");
    // }

    // public void withdraw(double amount) {
    //     if(amount > balance)
    //         throw new IllegalAccessError("Balance tidak cukup");
    //     balance -= amount ;
    //     System.out.println("[Account] - Withdraw success");
    // }
}
