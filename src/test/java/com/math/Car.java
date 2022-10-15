package com.math;

public class Car {


    public void printTopSpeed() {
        System.out.println("Top speed of the vehicle is 100 kmph");
    }

    public void printTopSpeed(int topSpeed) {
        System.out.println("Top speed of thevehicle is" + topSpeed + "kmph");
    }
    public void printTopSpeed(String vehicleName, int topSpeed) {
        System.out.println("Top speed of the vehicle" + vehicleName +" is " + topSpeed + " kmph");
    }
}
