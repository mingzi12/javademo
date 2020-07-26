package com.random;

/**
 * @author XXX
 * @description: XXX
 * @date 2019/9/7 20:01
 */
public class MathRandomDemo {

    public static void main(String[] args) {
        double random = Math.random();  //返回0~1，不包含1
        int random1 = (int)(random); //强制转换时，不是四舍五入，而是向下取整，例如(int)1.777，结果1
        System.out.println(random);
        System.out.println(random1);
    }
}
