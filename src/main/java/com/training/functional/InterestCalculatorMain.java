package com.training.functional;

import java.util.function.BiFunction;

import java.util.function.Function;

public class InterestCalculatorMain {



    //double calculateBunga (saldo, interestRate);

    private static void main (String [] args)
    {
            // 1. bunga = saldo x interestRate

             BiFunction <Double,Double,Double> calculateBunga = (saldo, interestRate) ->saldo*interestRate;

             //2.saldo baru = saldo + bunga
            Function<Double, Double> calculateSaldowithInterest = (interestRate) -> 1000 + interestRate;

            //3. saldo setelah pajak = saldoBaru *0.9

            Function<Double, Double> calculateTax = (saldo)-> saldo * 0.9;

            //4. 
            Function <Double, Double> calculateTotalSaldo = (saldo) -> saldo-5;

            
            double totalBalance = calculateBunga.andThen(calculateSaldowithInterest).andThen(calculateSaldowithInterest).andThen(calculateTax).andThen(calculateTotalSaldo).apply(10000.00, 0.5);

            System.out.println("total balance: " + totalBalance);

    }

}
