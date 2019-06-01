package com.java.demo.object.init.demo;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/27 17:33
 */
public class B extends A {
    static{

        System.out.print("B");

    }

    B(){

        System.out.print("b");

    }


    public static void main(String[] args) {
        new B();
    }

}
