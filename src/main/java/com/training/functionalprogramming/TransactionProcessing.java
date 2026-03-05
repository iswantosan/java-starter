package com.training.functionalprogramming;

import java.util.List;

public class TransactionProcessing {
    public static void main(String[] args) {
        List<Integer> transactions = List.of(
                500, 1200, 300, 2000, 1500, 700, 1800
        );

        final int result = transactions.stream()
                .filter(n -> n >= 1000)
                .distinct()
                .map(n -> n + 50)
                .mapToInt(n -> n)
                .max()
                .orElse(0);

        System.out.println("Result: " + result);
    }
}
