package com.map;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void treeSetOrderTest() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        List<Integer> integerList = Arrays.asList(2, 5, 4, 3, 8, 0);
        treeSet.addAll(integerList);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());


    }


    @Test
    public void treeSetOrderTest2() {

        TreeSet<Integer> treeSet = new TreeSet<>((obj1, obj2) -> obj2.intValue() - obj1.intValue());
        List<Integer> integerList = Arrays.asList(2, 5, 4, 3, 8, 0);
        treeSet.addAll(integerList);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());


    }
}
