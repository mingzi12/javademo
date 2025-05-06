package com.thread.demo;

import org.junit.Test;

public class ThreadTest {

    @Test
    public void test1() {
        int COUNT_BITS = Integer.SIZE - 3;
        int CAPACITY   = (1 << COUNT_BITS) - 1;
        System.out.println(COUNT_BITS);
        System.out.println(CAPACITY);
    }
}
