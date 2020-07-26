package com.inherit.demo.model;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/18 9:43
 */
public abstract class Animal {

    public String name;

    public String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void call();
}
