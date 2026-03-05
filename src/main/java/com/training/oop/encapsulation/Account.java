package com.training.oop.encapsulation;

public abstract class Account {
    
    protected int id;
    protected String accountNo;
    protected String accountTypeString;
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
    public void setAccouNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountTypeString() {
        return accountTypeString;
    }
    public void setAccountTypeString(String accountTypeString) {
        this.accountTypeString = accountTypeString;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {

         if (balance <=0)
         {
            throw new IllegalArgumentException("Balance must greater than 0");
         }
        this.balance = balance;
    } 


   /*  public void deposit (double amount)
    {
        balance += amount;
        System.out.println("deposit success: "); 
    }*/

    public void withdraw (double amount)
    {

        if (amount >balance)
            throw new IllegalArgumentException("Woy saldonya gak cukup");
        balance -= amount;
        System.out.println("[ACCOUNT]  accountNo: "+accountNo + " withdraw success, end saldo: " + balance); 
    }

 public abstract void deposit (double amount);
}
