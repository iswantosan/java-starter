package com.training.fp;

import java.util.List;

public class LatihanStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        
        // jumlahin yg genap
        int total= numbers.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(n -> n)
        .sum();
 
        System.out.println(total);
        
        
        List<String> names = List.of("alice", "Bob", "charlie");

        // buat jadi lower case
        names = names.stream()
        .map(name -> name.toLowerCase())
        .toList();

        System.out.println(names);

        //soal latihan
        List<Integer> transaction = List.of(500, 1200, 300, 2000, 1500, 700, 1800);

        // Ambil hanya transaksi >= 1000
        // Hilangkan transaksi duplikat
        // Tambahkan biaya administrasi 50 pada setiap transaksi
        // Ambil nilai max transaksi
        // Kalau tidak ada data tampilkan 0
        // Gunakan orElse(0)
        // Tampilkan resultnya

        int result = transaction.stream()
        .filter(n -> n >= 1000)
        .distinct()
        .map(n -> n + 50)
        .max(Integer::compareTo)
        .orElse(0);

        System.err.println(result);


    }
}
