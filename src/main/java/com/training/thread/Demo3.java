package com.training.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo3 {

    // static int counter = 0;

    // lock ini untuk memastikan variable counter bergantian jalannya
    // kalo gaada lock -> counter bisa jalan bareng dan numpuk di fornya
    // static Object lock = new Object();

    // file ini solusi lain dari lock -> tidak ada ganggu CPU
    // pake nya atomicInteger sebagai pengganti static int counter = 0;
    // atomicIngeter -> karna pake CAS (Compare and Swap)
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 1_000_000; i++) {
                // counter++;
                counter.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 1_000_000; i++) {
                // counter++;
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
