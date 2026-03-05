package com.training.functionalprogramming;

import java.util.List;

public class Demo3 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int total = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();


        List<String> names = List.of(
                "alice", "BoB", "charlie"
        );

        names.parallelStream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
