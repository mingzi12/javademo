package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
}
