package com.training.oop;

import com.training.oop.encapsulation.Account;
import com.training.oop.inheritance.CurrentAccount;
import com.training.oop.inheritance.SavingAccount;

public class DemoRunner {

    public static void main(String[] args) {

        Account acc = new CurrentAccount();
        acc.setAccountNo("1234567890");
        acc.setBalance(10_000_000);
        acc.withdraw(5_000);
        printAccountDetails(acc);

        acc = new CurrentAccount();
        acc.setAccountNo("838813212313");
        acc.setBalance(3_000_000);
        acc.withdraw(1_000);
        printAccountDetails(acc);

        acc = new SavingAccount();
        acc.setAccountNo("887372337242");
        acc.setBalance(4_000_000);
        acc.withdraw(2_000);
        printAccountDetails(acc);
    }

    private static void printAccountDetails(Account acc) {
        System.out.printf(
                "%s: %s%n\n",
                acc.getAccountNo(),
                acc.getBalance()
        );
    }
}