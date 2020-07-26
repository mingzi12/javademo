package com.sort.demo;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/6/11 10:38
 */
public class InsertionSortDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{12,15,20,8,10,1,3,5,2,11,9,6};
        arr = insertionSort(arr);
        System.out.println("插入排序");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    /**
     * 插入排序 (升序）
     * @param array
     * @return 排序后的数组
     */
    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
