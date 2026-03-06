package com.training.thread;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread worker1 = new Thread(() -> {
            System.err.println("Worker 1:" + Thread.currentThread().getName());
        });

        Thread worker2 = new Thread(() -> {
            System.err.println("Worker 2:" + Thread.currentThread().getName());
        });

        // start -> artinya jalan
        // join -> nunggu worker itu dulu sampai selesai
        worker2.start();
        worker2.join();

        worker1.start();
        worker1.join();

        System.err.println("Main: " + Thread.currentThread().getName());
    }
}
