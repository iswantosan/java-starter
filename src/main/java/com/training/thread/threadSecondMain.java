package com.training.thread;

public class threadSecondMain {
    static int counter = 0;
    static int counter2 = 0;

    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            for(int i = 0; i <= 1_000_000; i++){
                synchronized (lock) {
                    counter++;
                }
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0; i <= 1_000_000; i++){
                synchronized (lock) {
                    counter++;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        for(int i = 0; i <= 1_000_000; i++){
            counter2++;
        }
        for(int i = 0; i <= 1_000_000; i++){
            counter2++;
        }
        
        System.out.println("Counter: " + counter);
        System.out.println("Counter2: " + counter2);
    }
}
