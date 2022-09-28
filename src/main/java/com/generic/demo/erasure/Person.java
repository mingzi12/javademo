package com.generic.demo.erasure;

/**
 * @author XXX
 * @description: XXX
 * @date 2020/7/26 10:38
 */
public class Person implements Comparable<Person>{
    private int age;

    @Override
    public String toString() {
        return super.toString();
    }

    public Person() {
        super();
    }

    public Person(int age) { this.age = age; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person that) {
        return this.age - that.age;
    }

}