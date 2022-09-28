package com.lock.demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author XXX
 * @description: XXX
 * @date 2020/10/25 17:30
 */
public class ReentranTLockDemo {

    private static final ReentrantLock LOCK = new ReentrantLock(true);

    public static void main(String[] args) {

        Runnable runnable = thread1();
        Runnable runnable1 = thread2();

        new Thread(runnable, "thread1").start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(runnable1, "thread2").start();

        System.out.println("main thread end..................");

    }

    public static Runnable thread1() {

        Runnable runnable = () -> {
            LOCK.lock();
            try {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(".........." + Thread.currentThread().getName());
            } finally {
                System.out.println(".........." + Thread.currentThread().getName() + " release");
                LOCK.unlock();
            }
        };
        return runnable;
    }

    public static Runnable thread2() {

        Runnable runnable = () -> {
            LOCK.lock();
            try {
                System.out.println(".........." + Thread.currentThread().getName());
            } finally {
                System.out.println(".........." + Thread.currentThread().getName() + " release");
                LOCK.unlock();
            }
        };
        return runnable;
    }


}
