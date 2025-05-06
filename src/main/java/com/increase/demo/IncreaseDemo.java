package com.increase.demo;

public class IncreaseDemo {

    public static int preAdd() {
        int i = 8;
        int result = ++i;
        return result;
    }

    public static int subAdd() {
        int i = 8;
        int result = i++;
        return result;
    }


    public static void main(String[] args) {
        int i = 4;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(preAdd());
        System.out.println(subAdd());
    }
}
