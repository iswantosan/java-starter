package com.training.oop;

import java.text.DecimalFormat;

import com.training.oop.encapsulation.Account;
import com.training.oop.inheritance.CurrentAccount;
import com.training.oop.inheritance.SavingAccount;


public class DemoRunner {

    public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("#,##0.##");
    	
        //polymorphism
        //1. method overloading
        //2. method overidding (inheritance)
        
        Account acc01 = new CurrentAccount();
        //acc01.setAccountNo("001");
        //acc01.setBalance(10_000_000);
        //acc01.withdraw(5_000);
        //System.out.println(acc01.getAccountNo() + " : " + df.format(acc01.getBalance()));
        
        acc01 = new CurrentAccount();
        acc01.setAccountNo("001");
        acc01.setBalance(20_000_000);
        ((CurrentAccount) acc01).setOverdraftLimit(50_000_000);
        acc01.withdraw(5_000);
        System.out.println(acc01.getAccountNo() + " : " + df.format(acc01.getBalance()));
        
        acc01 = new SavingAccount();
        acc01.setAccountNo("001");
        acc01.setBalance(30_000_000);
        ((SavingAccount) acc01).setInterestRate(0.10);
        acc01.withdraw(5_000);
        System.out.println(acc01.getAccountNo() + " : " + df.format(acc01.getBalance()));
        
    }
        

}