package com.wait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/18 19:40
 */
public class WaitNotifyDemo {

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyDemo example = new WaitNotifyDemo();
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }
}
