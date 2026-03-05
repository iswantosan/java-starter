package com.training.solid.handson.violation;

import java.util.List;

public class demo3 {

    public static void main(String[] args) {

        List<String> names
                = List.of("Hamdhany", "DhanY", "BuDi");

        names.stream()
                .map(name -> name.toLowerCase())
                .forEach(System.out::println);

        List<Integer> transactions
                = List.of(500, 1200, 300, 2000, 1500, 700, 1800);

        int result = transactions.stream()
                .filter(transaction -> transaction >= 10000)
                .distinct()
                .map(transaction -> transaction + 50)
                .mapToInt(x -> x)
                .max().orElse(0);

        System.out.println("Hasil : " + result);

    }

}
