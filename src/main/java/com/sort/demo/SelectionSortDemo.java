package com.sort.demo;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/6/11 10:38
 */
public class SelectionSortDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{12,15,20,8,10,1,3,5,2,11,9,6};
        arr = selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    /**
     * 选择排序 (升序）
     * @param array
     * @return 排序后的数组
     */
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
