package com.training.coba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Condition{
    boolean test(int number);
}

public class trainingMain {

    static List<Integer> filter(List<Integer> numbers, Condition condition) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (condition.test(number)) {
                result.add(number);
            }
        }
        return result;
    }

    static List<Integer> even(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    static int sum(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    static List<Integer> prime(List<Integer> numbers) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static List<Integer> greaterThanTwo(List<Integer> numbers) {
        List<Integer> greaterThanTwoNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number > 2) {
                greaterThanTwoNumbers.add(number);
            }
        }
        return greaterThanTwoNumbers;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // sum even yang > 2

        System.out.println("hanya melihat jumlah bilangan genap: " + sum(even(numbers)));
        System.out.println("hanya melihat jumlah bilangan prima: " + sum(prime(numbers)));
        System.out.println("hanya melihat jumlah bilangan genap dan prima: " + sum(even(prime(numbers))));
        System.out.println("hanya melihat jumlah bilangan genap yang > 2: " + sum(greaterThanTwo(even(numbers))));

        int total = sum(filter(filter(numbers,new Condition(){
            @Override
            public boolean test(int number) {
                return number % 2 == 0;
            }
        }), new Condition(){
            @Override
            public boolean test(int number) {
                return number > 2;
            }
        }));

        System.out.println("hanya melihat jumlah bilangan genap yang > 2: " + total);


        // lambda expression
        int total2 = sum(filter(filter(filter(numbers,n -> n % 2 ==0),
         x -> x > 2),
         x -> x < 10));
        System.out.println("hasil dari lambda: " + total2);

        // input -> process/transform -> hasil
        // matematika = f(x) = x+1
        // g(x) = x*2
        // y = g(f(x)) , x = 3 , y = 8
    }
}
