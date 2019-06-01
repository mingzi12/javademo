package com.java.demo.model;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/18 13:02
 */
public class CloneCar implements Cloneable{

    private String[] arr;

    private int num;

    public CloneCar(String[] arr, int num) {
        this.arr = arr;
        this.num = num;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public Object clone() {
        CloneCar car = null;
        try{
            car = (CloneCar)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return car;

    }
}
