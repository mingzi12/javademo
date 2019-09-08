package com.java.demo.inherit.demo;

import com.java.demo.model.Animal;
import com.java.demo.model.Dog;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/18 10:03
 */
public class InheritDemo {



    public static void main(String[] args) {
        Animal animal = new Dog("小黄", "yellow");
        /*对于Java而言，它多态的实现机制遵循一个原则：当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
        但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法。该调用animal.sleep()会报错，因为父类中没有定义sleep()方法，
        若想调用sleep()方法，需要强制转型为Dog类型*/
        animal.call(); //父类中定义了call()方法，所以可以使用父类类型的引用变量调用call方法。
        ((Dog) animal).sleep(); //调用sleep()方法，需要强制转型为Dog类型
    }
}
