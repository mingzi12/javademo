package com.thread.demo.communication;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/6/1 22:39
 */
public class MethodTwo {

    private final ThreadToGo threadToGo = new ThreadToGo();
    public Runnable newThreadOne() {
        final String[] inputArr = Helper.buildNoArr(52);
        return new Runnable() {
            private String[] arr = inputArr;
            public void run() {
                try {
                    for (int i = 0; i < arr.length; i=i+2) {
                        synchronized (threadToGo) {
                            if (threadToGo.value == 2) {
                                System.out.print(" beforeThreadOne调用wait" +threadToGo.value);
                                threadToGo.wait();      //wait方法放在if中调用。调用wait
                                // 方法后，线程进入阻塞等待状态,后面的代码不会执行，且释放对象锁
                                System.out.print(" afterThreadOne调用wait" +threadToGo.value);
                            }
                            System.out.print(" ThreadOne继续执行" +threadToGo.value);

                            Helper.print(arr[i], arr[i + 1]);
                            threadToGo.value = 2;
                            /**
                             * 调用notify方法，唤醒一个处于wait状态的线程，另外要注意当前线程也可以参与获取对象锁，
                             * 但是下一个循环中value等于2
                             * ，会调用wait方法，即使当前线程获取到锁，调用wait
                             * 后也会释放锁，并进入wait状态（进入对象的等待队列中），其他的线程即可获取到锁。
                             */
                            threadToGo.notify();
                        }
                    }
                } catch (InterruptedException e) {
                    System.out.println("Oops...");
                }
            }
        };
    }
    public Runnable newThreadTwo() {
        final String[] inputArr = Helper.buildCharArr(26);
        return new Runnable() {
            private String[] arr = inputArr;
            public void run() {
                try {
                    for (int i = 0; i < arr.length; i++) {
                        synchronized (threadToGo) {
                            if (threadToGo.value == 1) {
                                System.out.print(" beforeThreadTwo调用wait" + threadToGo.value);
                                threadToGo.wait();
                                System.out.print(" afterThreadTwo调用wait" + threadToGo.value);
                            }
                            System.out.print(" ThreadTwo继续执行" + threadToGo.value);
                            Helper.print(arr[i]);
                            threadToGo.value = 1;
                            threadToGo.notify();  //同上
                        }
                    }
                } catch (InterruptedException e) {
                    System.out.println("Oops...");
                }
            }
        };
    }
    class ThreadToGo {
        int value = 1;
    }
    public static void main(String args[]) throws InterruptedException {
        MethodTwo one = new MethodTwo();
        Helper.instance.run(one.newThreadOne());
        Helper.instance.run(one.newThreadTwo());
        Helper.instance.shutdown();
    }

}
