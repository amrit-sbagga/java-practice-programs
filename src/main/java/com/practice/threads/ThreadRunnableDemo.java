package com.practice.threads;

/**
 * Practice: Extend {@code Thread} vs implement {@code Runnable}; start/join.
 */
public class ThreadRunnableDemo {

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " running");
        Thread t = new Thread(task, "worker");
        t.start();
        t.join();
        System.out.println("main done");
    }
}
