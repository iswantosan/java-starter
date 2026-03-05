package com.training.fp;

import java.util.ArrayList;
import java.util.List;

// anonymous class -> ??
public class Fungtional {

    static List<Integer> filter (List<Integer> number, Condition condition) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : number) {
            if (condition.test(n)) {
                result.add(n);   
            }
        }

        return result;
    }

    static int sum(List<Integer> number) {
        int total = 0;
        for (int n : number) {
            total = total + n;
        }
        return total;
    }

    static List<Integer> even(List<Integer> number) {
        List<Integer> numbers = new ArrayList<>();
        for (Integer n : number) {
            if (n % 2 == 0) {
                numbers.add(n);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 3, 4, 5);
        // int total = sum(even(number));
        // System.out.println(total);

        int total = sum(filter(filter(filter(number, new Condition() {
            @Override
            public boolean test(int n) {
                return n % 2 == 0;
            }
        }), new Condition() {
            @Override
            public boolean test(int n) {
                return n > 2;
            }
        }), new Condition() {
            @Override
            public boolean test(int n) {
                return n < 100;
            }
        }));

        // lambda expression
        total = sum(filter(filter(filter(number, n -> n % 2 == 0), n -> n > 2), n -> n < 100));

        
    }
}
