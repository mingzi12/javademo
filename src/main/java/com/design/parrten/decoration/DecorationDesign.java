package com.design.parrten.decoration;

public class DecorationDesign {
    public static void main(String[] args) {
        MilkTea boBoMilkTea = new BoBoMilkTea();
        boBoMilkTea = new Coconut(boBoMilkTea);
        boBoMilkTea = new Pearl(boBoMilkTea);
        System.out.println("奶茶名称：" + boBoMilkTea.description() + " 价格：" + boBoMilkTea.cost());
        System.out.println("=============================");
    }
}
