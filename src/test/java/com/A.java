package com;

public class A {
    int add(int i, int j) {
        return i + j;
    }
}

class B extends A {

    public static void main(String[] args) {

    short a = 6;
        //Non-static method 'add(int, int)' cannot be referenced from a static context
       // System.out.println(add(s, 9));
    }
}


/*
public class 滑动窗口的最大值 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (size < 1 || num.length < size) {
            return list;
        }
        int left = 0;
        int right = size - 1;
        while (right < num.length) {
            int val = calcMax(left, right, num);
            list.add(val);
            left++;
            right++;
        }
        return list;
    }

    public int calcMax(int left, int right, int[] num) {
        int max = num[left];
        for (int i = left; i <= right; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }
*/
