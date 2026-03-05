package com.training.oop;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.training.day2.Conditions;
import com.training.oop.encapsulation.Account;
import com.training.oop.inheritance.CurrentAccount;
import com.training.oop.inheritance.SavingAccount;

public class DemoRunner {

    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.setAccountNumber("527123098");
        account.setAccountType("Savings");
        account.setBalance(10_000_000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance());

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNumber("7782396537");
        currentAccount.setOverdraftLimit(5_000_000);

        System.out.println("Current Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountNumber("123456789");
        savingAccount.setInterestRate(2.5);

        System.out.println("Saving Account Number: " + savingAccount.getAccountNumber());
        System.out.println("Interest Rate: " + savingAccount.getInterestRate());

        System.out.println("\n--- Polymorphism Demo ---");

        Account acc01 = new CurrentAccount();
        acc01.setAccountNumber("545454545");
        acc01.setAccountType("DEFAULT");
        acc01.setBalance(10_000_000);
        acc01.withdraw(84_900);

        System.out.println("CurrentAccount# Account Number: " + acc01.getAccountNumber());
        System.out.println("CurrentAccount# Overdraft Limit: " + ((CurrentAccount) acc01).getOverdraftLimit());

        acc01 = new SavingAccount();
        acc01.setAccountNumber("545454545");
        acc01.setBalance(65_000_000);
        acc01.deposit(5_000_000);
        ((SavingAccount) acc01).setInterestRate(2.5);
        System.out.println("SavingAccount# Account Number: " + acc01.getAccountNumber());
        System.out.println("SavingAccount# Interest Rate: " + ((SavingAccount) acc01).getInterestRate());

        System.out.println("\n============================================================\n");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // test with anonymous class
        int total = sum(filter(
                filter(numbers, new Conditions() {
                    @Override
                    public boolean test(int n) {
                        return n % 2 == 0;
                    }
                }), new Conditions() {
                    @Override
                    public boolean test(int n) {
                        return n > 2;
                    }
                }));

        System.out.println("Sum of even numbers: " + total);

        // test with lambda expression
        int total2 = sum(
                filter(filter(filter(numbers, n -> n % 2 == 0), n -> n > 2), n -> n < 10));
        System.out.println("Sum of even numbers: " + total2);

        double saldoAwal = 1000;
        int interestRate = 5;

        BiFunction<Double, Integer, Double> calculateInterest = (saldo, rate) -> saldo * (rate / 100);

        Function<Double, Double> calculateSaldoAwal = (interestAmount) -> saldoAwal + interestAmount;

        Function<Double, Double> calculateSaldoAfterTax = (saldo) -> saldo * 0.9;

        Function<Double, Double> calculateFinalSaldo = (saldoAfterTax) -> saldoAfterTax - 5;

        double finalBalance = calculateInterest
                .andThen(calculateSaldoAwal)
                .andThen(calculateSaldoAfterTax)
                .andThen(calculateFinalSaldo)
                .apply(saldoAwal, interestRate);

        System.out.println("Final Balance: " + finalBalance);

        System.out.println("\n============================================================\n");

        String username = " Budi";
        String password = "Admin12345";

        // 1 combine username and password dengan tanda :
        // combine = username + : + password
        BiFunction<String, String, String> combine = (u, p) -> u + ":" + p;

        // 2 hilangkan spasi
        Function<String, String> removeWhitespace = result -> result.trim();

        // 3 ubah semua huruf menjadi lowercase
        Function<String, String> toLowerCase = result -> result.toLowerCase();

        // 4 ganti semua huruf a menjadi karakter *
        Function<String, String> replaceAWithStar = result -> result.replaceAll("a", "*");

        String finalString = combine
                .andThen(removeWhitespace)
                .andThen(toLowerCase)
                .andThen(replaceAWithStar)
                .apply(username, password);
        System.out.println("Final String: " + finalString);

        System.out.println("\n============================================================\n");
        // Ambil hanya trans >= 1000
        // Hilangkan trans duplicate
        // tambah biaya admin 50 pada setiap transaksi
        // ambil nilai max
        // kalau tidak ada tampil 0

        List<Integer> transactions = List.of(500, 1200, 300, 2000, 1500, 700, 1000);
        int testMaxFilter = 1000;

        Optional<Integer> maxTransaction = Optional.of(
                transactions.stream()
                        .filter(n -> n >= testMaxFilter)
                        .distinct()
                        .map(n -> n + 50)
                        .max(Integer::compareTo)
                        .orElse(0));

        System.out.println("Max Transaction: " + maxTransaction);

        System.out.println("\n============================================================\n");
    }

    static List<Integer> even(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }

    static int sum(List<Integer> numbers) {
        int total = numbers.stream().mapToInt(Integer::intValue).sum();
        return total;
    }

    static List<Integer> filter(List<Integer> numbers, Conditions condition) {
        return numbers.stream()
                .filter(n -> condition.test(n))
                .toList();
    }
}