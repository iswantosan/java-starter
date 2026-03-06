package com.training.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class threadThirdMain {
    // static int counter = 0;
    static int counter2 = 0;

    static AtomicInteger counter = new AtomicInteger(0);
    //CAS (Compare and Swap)

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1_000_000; i++) {
                counter.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1_000_000; i++) {
                counter.incrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        for (int i = 1; i <= 1_000_000; i++) {
            counter2++;
        }
        for (int i = 1; i <= 1_000_000; i++) {
            counter2++;
        }

        System.out.println("Counter: " + counter);
        System.out.println("Counter2: " + counter2);
    }
}
