package com.exception.demo;

public class ExceptionDemo {

    public static int func0() {
        int i = 2;
        for (int j = 1; j < 2; j++) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                throw  e;
            } finally {
                continue;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println("a" + func0());
    }
}
