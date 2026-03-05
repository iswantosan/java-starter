package com.training.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class InterestCalculator {
    /**
     * Step 1
     * Hitung bunga tabungan dengan rumus:
     * bunga = saldo × interestRate
     * Step 2
     * Tambahkan bunga ke saldo awal:
     * saldoBaru = saldo + bunga
     * Step 3
     * Bank kemudian memotong pajak bunga sebesar 10%:
     * saldoSetelahPajak = saldoBaru × 0.9
     * Step 4
     * Bank juga mengenakan biaya administrasi tetap sebesar 5:
     * saldoAkhir = saldoSetelahPajak − 5
     *
     * Diketahui:
     * saldo awal = 1000
     * interest rate = 5% (0.05)
     */

    public static void main(String[] args) {
        // 1. bunga = saldo x interestRate
        BiFunction<Double, Double, Double> calculateBunga = (saldo, interestRate) -> saldo * interestRate;

        // 2. saldoBaru = saldo + bunga
        Function<Double, Double> calculateSaldoBaru = (bunga) -> 1000.0 - bunga;

        // 3. saldoSetelahPajak = saldoBaru × 0.9
        Function<Double, Double> calcSaldoSetelahPajak = (saldoBaru) -> saldoBaru * 0.9;

        // 4. saldoAkhir = saldoSetelahPajak − 5
        Function<Double, Double> calcSaldoAkhir  = (saldoSetelahPajak) -> saldoSetelahPajak - 5;

        // gabungin time
        double result = calculateBunga
                .andThen(calculateSaldoBaru)
                .andThen(calcSaldoSetelahPajak)
                .andThen(calcSaldoAkhir)
                .apply(1000.0, 0.05);

        System.out.println(result);
    }
}
