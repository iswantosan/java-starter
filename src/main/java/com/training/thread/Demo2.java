package com.training.thread;

public class Demo2 {
    
    static int counter = 0;
    static Demo1 lock = new Demo1();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                counter++;
                System.out.println(counter);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                counter++;
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
