package com.java.demo.offer;

import java.util.Random;

/**
 * @author XXX
 * @description: 【剑指offer】在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 输入这样的一个二维数组和一个整数，判断数组中是否含该整数
 * @date 2019/8/11 20:41
 */
public class FindEleInArray {

    /**
     * 生成符合题意的二维数组
     * @param row 数组行宽
     * @param col 数组列宽
     * @return 二维数组
     */
    public static int[][] genArray(int row, int col) {
        int random = new Random().nextInt(10) + 1;
        int tempRandom = random;
        int[][] array = new int[row][col];
        for (int i = 0 ; i < row; i++) {
            for(int j = 0 ; j < col; j++) {
                array[i][j] = random;
                random ++;
            }
            tempRandom++;
            random = tempRandom;
        }
        return array;
    }


    /**
     * 判断二维数组是否包含输入的整数（解题思路:根据题意，二维数组是有序的，从最左下角起，向上数字递减，向右数字递增
     * 因此可以从最左下角开始查找，当要查找数字比当前位置的数字大时，右移，当要查找数字比当前位置的数字小时，上移。以此类推，
     * 要么找到指定数字，要么找不到，遍历完整个数组返回false）
     * @param array 二维数组
     * @param target 要查找的整数
     * @return true/包含，false/不包含
     */
    public static boolean isContanin(int[][] array, int target) {
        int low = array.length - 1;  //二维数组行宽
        int col = 0;
        int maxCol = array[0].length - 1;  //二维数组列宽
        for (int i = 0 ; i < low ; i++) {
            for (int j = 0 ; j < array[i].length ; j++) {
                System.out.print(array[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        while (col <= maxCol && low >= 0) {
            if(array[low][col] > target) {
                low--;
            }
            else if(array[low][col] < target) {
                col++;
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int row = random.nextInt(6) + 4;
        int col = random.nextInt(6) + 5;
        int target = random.nextInt(10) + 1;

        int[][] array = genArray(row, col);
        boolean isExist = isContanin(array,target);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        if (isExist) {
            System.out.println("数组包含该整数:" + target);
        }
        else {
            System.out.println("数组不包含该整数:" + target);
        }



    }
}
