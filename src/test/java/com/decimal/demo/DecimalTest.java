package com.decimal.demo;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalTest {

    @Test
    public void testAdd() {
        //用double类型初始化BigDecimal对象
        BigDecimal numA = new BigDecimal(0.05);
        BigDecimal numB = new BigDecimal(0.06);
        System.out.println("numA + numB = " + numA.add(numB));
        //用double类型和int类型初始化BigDecimal对象。（作加法运算时得到的只是一个近似值）
        BigDecimal numC = new BigDecimal(3.05);
        BigDecimal numD = new BigDecimal(100);
        System.out.println("numC + numD = " + numC.add(numD));
        //用字符串类型初始化BigDecimal对象。（作加法运算时得到的是精确值）
        BigDecimal strA = new BigDecimal("3.05");
        BigDecimal strB = new BigDecimal("100");
        System.out.println("strA + strB = " + strA.add(strB));
    }


    @Test
    public void test2() {
        BigDecimal a = new BigDecimal("2.121").setScale(2, RoundingMode.UP);
        System.out.println("2.121(保留2位小数位，RoundingMode.UP) : " + a.toString());
        BigDecimal b = new BigDecimal("-2.125").setScale(2, RoundingMode.UP);
        System.out.println("-2.125(保留2位小数位，RoundingMode.UP): " + b.toString());

        BigDecimal c = new BigDecimal("-2.125").setScale(2, RoundingMode.DOWN);
        System.out.println("-2.125(保留2位小数位，RoundingMode.DOWN): " + c.toString());

        BigDecimal d = new BigDecimal("-2.121").setScale(2, RoundingMode.HALF_UP);
        System.out.println("-2.121(保留2位小数位，RoundingMode.HALF_UP): " + d.toString());
        BigDecimal e = new BigDecimal("-2.125").setScale(2, RoundingMode.HALF_UP);
        System.out.println("-2.125(保留2位小数位，RoundingMode.HALF_UP): " + e.toString());
        BigDecimal f = new BigDecimal("2.121").setScale(2, RoundingMode.HALF_UP);
        System.out.println("2.121(保留2位小数位，RoundingMode.HALF_UP): " + f.toString());
 BigDecimal f1 = new BigDecimal("2.125").setScale(2, RoundingMode.HALF_UP);
        System.out.println("2.125(保留2位小数位，RoundingMode.HALF_UP): " + f1.toString());

        BigDecimal g = new BigDecimal("-2.121").setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("-2.121(保留2位小数位，RoundingMode.HALF_DOWN): " + g.toString());
        BigDecimal h = new BigDecimal("-2.125").setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("-2.125(保留2位小数位，RoundingMode.HALF_DOWN): " + h.toString());
        BigDecimal h1 = new BigDecimal("-2.126").setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("-2.126(保留2位小数位，RoundingMode.HALF_DOWN): " + h1.toString());
        BigDecimal i = new BigDecimal("2.125").setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("2.125(保留2位小数位，RoundingMode.HALF_DOWN): " + i.toString());
 BigDecimal j = new BigDecimal("2.126").setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("2.126(保留2位小数位，RoundingMode.HALF_DOWN): " + j.toString());

    }
}
