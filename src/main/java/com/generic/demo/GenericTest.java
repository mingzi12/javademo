package com.generic.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XXX
 * @description: XXX
 * @date 2020/7/26 9:31
 */
public class GenericTest {


    public static void main(String[] args) {
        SuperInterface<String> subClass = new SubClass();
        Class<? extends SuperInterface> aClass = subClass.getClass();

        System.out.println(aClass);

        ArrayList<String> list = new ArrayList<>();
        Class<? extends ArrayList> arrayListClass = list.getClass();

        System.out.println(arrayListClass);

        // 无界通配符？只能用于读取数据时使用，新增数据时，不能使用，如下例子编译就会报错
        //List<?> aList = new ArrayList<>();
        // aList.add("泛型");

        // 测试泛型方法

        SubClass<String> subClass1 = new SubClass<>();
        int sbz = subClass1.getGenericMethod("sbz");

        System.out.println("年龄 " + sbz);





    }
}
