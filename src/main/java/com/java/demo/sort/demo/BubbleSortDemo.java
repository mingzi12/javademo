package com.java.demo.sort.demo;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/6/11 10:38
 */
public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{12,15,20,8,10,1,3,5,2,11,9,6};
        arr = bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    /**
     * 冒泡排序（升序）
     *
     * @param array
     * @return  排序后的数组
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        }
        return array;
    }
}
