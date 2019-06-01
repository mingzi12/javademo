package com.java.demo.clone.demo;

import com.java.demo.model.CloneCar;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/18 13:01
 */
public class CloneDemo {

    public static void main(String[] args) {
        String[] arr = new String[] {"Car1", "Car2"};
        CloneCar cloneCar = new CloneCar(arr, 2);
        //clone返回的对象是新的对象，新对象中引用类型的变量的指向地址和原对象中的引用变量指向的地址相同
        CloneCar cloneCar1 = (CloneCar) cloneCar.clone();
        CloneCar cloneCar2 = cloneCar;

        System.out.println(cloneCar);
        System.out.println(cloneCar1);
        System.out.println(cloneCar2);
        /*输出：
        com.java.demo.model.CloneCar@1540e19d
        com.java.demo.model.CloneCar@677327b6
        com.java.demo.model.CloneCar@1540e19d*/


    }
}
