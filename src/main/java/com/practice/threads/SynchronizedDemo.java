package com.practice.threads;

/**
 * Practice: {@code synchronized} blocks; increment counter safely from N threads.
 * TODO: Fix race — 2 threads each add 100_000; expect 200_000.
 */
public class SynchronizedDemo {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo demo = new SynchronizedDemo();
        Runnable r = () -> {
            for (int i = 0; i < 100_000; i++) {
                demo.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count = " + demo.count);
    }
}
