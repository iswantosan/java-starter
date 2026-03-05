package com.training.oop;

import com.training.oop.encapsulation.Account;
import com.training.oop.inheritance.CurrentAccount;
import com.training.oop.inheritance.SavingAccount;

public class DemoRunner {

    public static void main(String[] args) {

        Account acc = new CurrentAccount();
        acc.setAccountNo("123456789");
        acc.setBalance(10_000);

        System.out.println(acc.getAccountNo() + " " + acc.getBalance());
        
        CurrentAccount cacc = new CurrentAccount();
        cacc.setAccountNo("123456789");
        cacc.setBalance(10_000);

        SavingAccount sacc = new SavingAccount();
        sacc.setAccountNo("123456789");
        sacc.setBalance(1000);


        // konsep polymorphism -> poli artinya banyak
        Account acc01 = new CurrentAccount();
        acc01.setAccountNo("001");
        acc01.setBalance(10_000_000);
        acc01.withdraw(5_000);

        acc01 = new CurrentAccount();
        acc01.setAccountNo("001");
        acc01.setBalance(20_000_000);
        acc01.withdraw(10_000);


        acc01 = new SavingAccount();
        acc01.setAccountNo("001");
        acc01.setBalance(30_000_000);
        ((SavingAccount) acc01).setInterestRate(10);
        acc01.withdraw(15_000);


      

    }
}