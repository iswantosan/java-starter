package com.training.solid.violation.srp;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccountSRP acc = new BankAccountSRP("ACC-001", "", 100_000);

        // Expect: hanya update saldo
        acc.deposit(50_000);

        // Assert manual (tanpa JUnit)
        double expected = 150_000;
        if (acc.getBalance() != expected) {
            throw new RuntimeException("FAIL: expected balance " + expected + " but got " + acc.getBalance());
        }

        System.out.println("PASS: balance ok = " + acc.getBalance());
    }
}