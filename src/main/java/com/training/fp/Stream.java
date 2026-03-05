package com.training.fp;

import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> transactions = List.of(
                500, 1200, 300, 2000, 1500, 700, 1800
        );
        // Ambil hanya transaksi ≥ 1000
        // Hilangkan transaksi duplikat
        // Tambahkan biaya administrasi 50 pada setiap transaksi
        // ambil nilai max transaksi
        // kalau tidak ada data tampilkan 0
        // gunakan orElse(0)
        // tampilkan resultnya
        Integer result = transactions.stream()
                .filter(transaction -> transaction >= 1000)
                .distinct()
                .map(transaction -> transaction + 50)
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println(result);
    }
}
