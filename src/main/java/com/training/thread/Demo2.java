package com.training.thread;

public class Demo2 {

    static int counter = 0;
    // lock ini untuk memastikan variable counter bergantian jalannya
    // kalo gaada lock -> counter bisa jalan bareng dan numpuk di fornya
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 1_000_000; i++) {
                synchronized (lock) {
                    counter++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 1_000_000; i++) {
                synchronized (lock) {
                    counter++;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);

    }
}
