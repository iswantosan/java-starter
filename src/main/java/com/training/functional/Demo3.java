package com.training.functional;

import java.util.List;

public class Demo3 {

    public static void main(String[] args) {
        
        List<String> listNames = List.of("Ham", "Dany", "BoA");

        listNames = listNames.stream().map(listName -> listName.toLowerCase()).toList();
    List<Integer> transactions = List.of(500, 1200, 300, 2000, 1500, 700, 1800);

        // Ambil hanya transaksi ≥ 1000
        // Hilangkan transaksi duplikat
        // Tambahkan biaya administrasi 50 pada setiap transaksi
        // ambil nilai max transaksi
        // kalau tidak ada data tampilkan 0
        // gunakan orElse(0)
        // tampilkan resultnya


 int result =    transactions.stream().filter(trx -> trx>1000).distinct().map(trx -> trx + 50).mapToInt(x -> x).max().orElse(0);
        System.out.println("hasil: " + result);

}

}
