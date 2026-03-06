package com.training.stream;

import java.util.List;

public class stream {

    public static void main(String[] args) {
        
        List<Integer> transaction = List.of(500, 1200, 300, 2000, 1500, 700, 1800);

        Integer integer = transaction.stream()
        .filter(transactions -> transactions > 1000)
        .distinct()
        .map(trx -> trx + 50)
        .max(Integer::compare)
        .orElse(0);

        System.out.println("hasil : " + integer);
        System.out.println(Thread.currentThread().getName());
    }    
}
