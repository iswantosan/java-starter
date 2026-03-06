package com.training.thread;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread worker1 = new Thread(() -> {
            System.out.println("Worker 1 : " + Thread.currentThread().getName());
        });
        Thread worker2 = new Thread(() -> {
            System.out.println("Worker 2 : " + Thread.currentThread().getName());
        });
        worker2.start();
        worker2.join();

        worker1.start();
        worker1.join();
        System.out.println("Main : " + Thread.currentThread().getName());
    }
}
