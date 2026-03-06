package com.training.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class demo2 {
    
    static AtomicInteger counter = new AtomicInteger(0);

    static Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 1_000_000; i++) {
                counter.incrementAndGet();
            }
        });
        
                Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 1_000_000; i++) {
                    counter.incrementAndGet();
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println(counter);
    }

}
