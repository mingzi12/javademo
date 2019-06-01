package com.java.demo.model;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/18 9:46
 */
public class Dog extends Animal {



    public Dog(String name, String color) {

        /*子类默认构造器第一行默认会调用父类的默认构造器super()，如果父类没有默认构造器，则子类必须显示调用父类的含参构造器
        super(name, color),否则会报错
        */
        //super();
        this.name = name;
        this.color = color;
    }

    @Override
    public void call() {
        System.out.println("旺旺。。。。。。。。。。");
    }

    public void sleep() {
        System.out.println("小黄睡觉了。。。。。。");
    }
}
