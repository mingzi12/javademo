package com;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //System.out.println("++++++++++++++++++++++++++++");
        //test1();
        System.out.println("++++++++++++++++++++++++++++");
        test2();
        System.out.println("++++++++++++++++++++++++++++");
    }

    static void test1() {
        int j;
        int i = 0;
        for (j = 0; j <= 10; j++) {
            i = i++;
        }
        System.out.println("累加后i的值是：" + i);
    }

    static void test2() {
        int i;
        int j = 0;
        for (i = 0; i <= 10; i++) {
            j = ++j;
        }
        System.out.println("++i累加后i的值是：" + i);
    }

    static void test3() {
        byte a = 127;
        byte b = 127;
        // b = a + b;报编译错误:cannot convert from int to byte
        int c = a + b;

        b += a; // +=操作符会对右边的表达式结果强转匹配左边的数据类型,所以没错.
    }
}
