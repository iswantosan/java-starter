package com.training.oop.encapsulation;

// dibikin abstract -> agar bikin contoh materi abstraction
public abstract class Account {

    // contoh encapsulation -> information hiding
    // private int id;
    // private String accountNo;
    // private String acccountType;
    // private double balance;

    // ubah ke protected -> untuk kebutuhan inheritance biar bisa di akses sama class child
    protected int id;
    protected String accountNo;
    protected String acccountType;
    protected double balance;


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

    public String getAcccountType() {
        return acccountType;
    }

    public void setAcccountType(String acccountType) {
        this.acccountType = acccountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0)
            throw new IllegalArgumentException("Balance must greater than 0");
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);


    // public void deposit(double amount){
    //     balance += amount;
    //     System.out.println("Deposit success");
    // }

    // public void withdraw(double amount){
    //     if(amount > balance)
    //         throw new IllegalArgumentException("Balance not enough");
    //     balance -= amount;
    //     System.out.println("[Account] - Withdraw success");
    // }
}
