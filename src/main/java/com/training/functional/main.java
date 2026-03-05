package com.training.functional;

import java.util.ArrayList;
import java.util.List;

interface Condition {
    boolean test(int n);

}

public class main {

    static List<Integer> filter(List<Integer> numbers, Condition condition) {
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (condition.test(n)) {
                result.add(n);
            }
        }

        return result;

    }

    public static void main(String[] args) {





        /*
         * int total = 0;
         * List<Integer> numbers =
         * List.of(1, 2, 3, 4, 5);
         * for (int n : numbers) {
         * if (n % 2 == 0) {
         * total = total + n;
         * }
         * }
         */
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        //int total = sum(even(numbers));
        
        int total = sum(filter(filter(numbers, new Condition() {

            @Override
            public boolean test(int n) {
                // TODO Auto-generated method stub
                return n>2;
            }
            
        }),new Condition() {

            @Override
            public boolean test(int n) {
                // TODO Auto-generated method stub
                return n%2==0;
            }
            
        }));
     
Condition conditionGreaterThanTwo = m -> m>2;
Condition conditionEven = m -> m%2==0;

      total = sum ( filter (filter(numbers, conditionEven),x -> x%2==0) );

        
        System.out.println("total: " + total);

    }

    static List<Integer> even(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }

        return result;

    }

    static int sum(List<Integer> numbers) {
        int sum = 0;
        for (Integer n : numbers) {
            sum = sum + n;
        }

        return sum;

    }

}

// lambda