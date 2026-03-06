package com.training.thread;

public class threadMain {
    public static void main(String[] args) throws InterruptedException {

        Thread worker1 = new Thread(() -> {
            System.out.println("Worker 1: " + Thread.currentThread().getName());
        });

        Thread worker2 = new Thread(() -> {
            System.out.println("Worker 2: " + Thread.currentThread().getName());
        });
        
       
        worker2.start(); //start worker2 terlebih dahulu
        worker2.join(); //tunggu worker2 selesai sebelum melanjutkan ke worker1

        worker1.start(); //start worker1 setelah worker2 selesai
        worker1.join(); //tunggu worker1 selesai sebelum melanjutkan ke main thread
        
        System.out.println("Main: " + Thread.currentThread().getName());
    }
}
