package com.training.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

interface Condition {
    boolean test(int n);
}

public class Demo1 {

    private static List<Integer> filter(List<Integer> numbers, Condition f) {
        List<Integer> result = new ArrayList<>();

        for (int n : numbers) {
            if (f.test(n)) {
                result.add(n);
            }
        }

        return result;
    }

    private static int sum(List<Integer> numbers) {
        int total = 0;

        for (int n : numbers) {
            total = total + n;
        }

        return total;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

//        // imperative programming
//        int total = 0;
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//
//        for (int n : numbers) {
//            if (n % 2 == 0) {
//                total = total + n;
//            }
//        }

        // functional programming
//        int result = sum(even(numbers));
        int result = sum(filter(filter(numbers, new Condition() {
            @Override
            public boolean test(int n) {
                return n % 2 == 0;
            }
        }), new Condition() {
            @Override
            public boolean test(int n) {
                return n > 2;
            }
        }));

        // using lambda
        sum(filter(filter(numbers, n -> n % 2 == 0), n -> n > 2));

        System.out.println(result);
    }
}
