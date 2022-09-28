package com.atomic.demo;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author XXX
 * @description: XXX
 * @date 2020/10/20 21:46
 */
public class AtomicTest {

    @Test
    public void atomicArrayTest() {
        int[] value = new int[] { 1, 2};
        AtomicIntegerArray array = new AtomicIntegerArray(value);

        array.getAndSet(0, 3);
        System.out.println(array.get(0));
        System.out.println(value[0]);

    }
}
