package com.training.coba;

import java.util.List;
import java.util.OptionalInt;

public class demo3 {
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

        int total= numbers.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(n -> n)
        .sum();

        System.out.println(total);

        List<String> names = List.of("AlIce","AlIce","BoB","bOB","CharLie");

        //jumlah cpu - 1
        names=names.stream()
        .map(name -> name.toLowerCase())
        .distinct()
        .toList();

        System.out.println(names);

        List<Integer> transactions = List.of(500,1200,300,2000,1500,700,1800);

        OptionalInt totalTransactions = transactions.stream()
        .filter(t -> t >= 1000)
        .distinct()
        .mapToInt(t -> t+50)
        .max();

        totalTransactions.ifPresentOrElse(
            max -> System.out.println("angka yang paling tinggi: " + max),
            () -> System.out.println("Tidak ada transaksi yang memenuhi kriteria.")
        );
    }
}
