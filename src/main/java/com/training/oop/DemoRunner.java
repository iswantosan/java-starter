package com.training.oop;

import com.training.oop.encapsulation.Account;
import com.training.oop.inheritance.CurrentAccount;
import com.training.oop.inheritance.SavingsAccount;

public class DemoRunner {

    public static void main(String[] args) {

        System.out.println("=== Demo ===");

      Account acc = new CurrentAccount();
      acc.setAccouNo("0000000123");
      acc.setBalance(20000);
    //    acc.withdraw(-10_000_000);

      System.out.println("accountNo: " + acc.getAccountNo());

      CurrentAccount cracc = new CurrentAccount();
      cracc.setAccouNo("000000534");
      cracc.setBalance(10_000_000);

      SavingsAccount svcc = new SavingsAccount();
      svcc.setAccouNo("00001234");
      svcc.setBalance(5_000_000);

      Account acc01 = new CurrentAccount();
      acc01.setAccouNo("01232141");
      acc01.setBalance(10_000_000);
      acc01.withdraw(5);

      acc01 = new CurrentAccount();
      acc01.setAccouNo("00007542");
      acc01.setBalance(10_000_000);
     acc01.withdraw(9);


      acc01 = new SavingsAccount();
      acc01.setAccouNo("00007542"); 
      acc01.setBalance(10_000_000);
      acc01.withdraw(11);


    }
}