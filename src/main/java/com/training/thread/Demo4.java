package com.training.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo4 {
    public static void main(String[] args) {
        // memberi tahu bahwa koneksi thread maksimum 3
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            pool.submit(() -> {
                System.out.println("Thread : " + Thread.currentThread().getName());
            });  
        }
        pool.shutdown(); 
    }
}
