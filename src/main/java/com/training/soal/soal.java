package com.training.soal;

import java.util.function.BiFunction;
import java.util.function.Function;

public class soal {

    // double calculateBunga(double saldoAwal, double interestRate) {
    //     return saldoAwal * interestRate;
    // }

    public static void main(String[] args) {
        // Step 1
        // Hitung bunga tabungan dengan rumus:
        // bunga = saldo × interestRate
        // Step 2
        // Tambahkan bunga ke saldo awal:
        // saldoBaru = saldo + bunga
        // Step 3
        // Bank kemudian memotong pajak bunga sebesar 10%:
        // saldoSetelahPajak = saldoBaru × 0.9
        // Step 4
        // Bank juga mengenakan biaya administrasi tetap sebesar 5:
        // saldoAkhir = saldoSetelahPajak − 5
        
        // Diketahui:
        // saldo awal = 1000
        // interest rate = 5% (0.05)
        
        //step 1
        BiFunction<Double, Double, Double> calculateBunga = (saldo, interestRate) -> saldo * interestRate;

        //step 2
        Function<Double, Double> calculateSaldo = (bunga) -> 1000 + bunga;

        //step 3
        Function<Double, Double> saldoSetelahPajak = (saldo) -> saldo * 0.9;

        //step 4
        Function<Double,Double> saldoAkhir = (saldo) -> saldo - 5;

        double saldo=1000;
        double interestRate=0.05;

        double result= calculateBunga
        .andThen(calculateSaldo)
        .andThen(saldoSetelahPajak)
        .andThen(saldoAkhir)
        .apply(saldo, interestRate);

        System.out.println("Hasil akhir: " + result);
    }
}
