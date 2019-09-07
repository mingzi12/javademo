package com.java.demo.enumeration;

/**
 * @author XXX
 * @description: XXX
 * @date 2019/9/7 10:43
 */
public class EnumerationTest {

    public static void main(String[] args) {
        SIZE medium = SIZE.MEDIUM;
        SIZE small = SIZE.valueOf("MEDIUM");
        System.out.println(medium.getDesc());
        System.out.println(small.getDesc());
    }
}
