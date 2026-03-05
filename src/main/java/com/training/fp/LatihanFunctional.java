package com.training.fp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LatihanFunctional {
    
    public static void main(String[] args) {

        // BiFunction<Double, Double, Double> saldoAwal = 
        // (saldo, interest) -> saldo * interest;

        Function<Double, Double> calculateBalance =
        balance -> balance * 0.05;

        Function<Double, Double> calculateBalanceFunction = 
        interest -> 1000 * interest;

        Function<Double, Double> calculateTax = 
        balance -> balance * 0.9;

        Function<Double, Double> calculateAfterTax =
        balance -> balance - 5;

        double result = calculateBalance
        .andThen(calculateBalanceFunction)
        .andThen(calculateTax)
        .andThen(calculateAfterTax)
        .apply(1.000);

        System.out.println("balance : " + result);
    }
}
