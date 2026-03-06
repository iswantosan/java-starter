package com.training.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo3 {
    
    static AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                counter.incrementAndGet();
                System.out.println(counter);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                counter.incrementAndGet();
                System.out.println(counter);
            }
        });
        t2.start();
        t2.join();

        t1.start();
        t1.join();

        System.out.println(counter);
    }
}
