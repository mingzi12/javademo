package com.list.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/6/3 16:59
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> userList = new ArrayList<>(10);
        userList.add("peter");
        String item = userList.get(0);
        System.out.println(userList);
    }
}
