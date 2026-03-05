package com.training.oop;

import com.training.oop.model.Account;
import com.training.oop.model.CurrentAccount;
import com.training.oop.model.SavingAccount;

public class DemoRunner {

    public static void main(String[] args) {

        // Account account = new Account();
        Account account = new CurrentAccount();
        account.setAccountNo("12345");
        account.setBalance(100_000);
        // account.withdraw(1_000_000);

        System.out.println(account.getAccountNo() + " : " + account.getBalance());

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNo("12345");
        currentAccount.setBalance(100_000);

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountNo("12345");
        savingAccount.setBalance(100_000);

        // polymorphism
        // 1. method overloading -> 1 method yang sama tapi parameter inputnya beda beda
        // 2 . method overriding -> 
        // Account account01 = new Account();
        Account account01 = new CurrentAccount();
        account01.setAccountNo("12345");
        account01.setBalance(100_000);
        account01.withdraw(1_000);

        account01 = new CurrentAccount();
        account01.setAccountNo("12345");
        account01.setBalance(100_000);
        account01.withdraw(1_000);

        account01 = new SavingAccount();
        account01.setAccountNo("12345");
        account01.setBalance(100_000);
        account01.withdraw(1_000);

        SavingAccount account2 = new SavingAccount();
        account2.setAccountNo("12345");
        account2.setBalance(100_000);
        account2.withdraw(1_000, "12345");
    }
}