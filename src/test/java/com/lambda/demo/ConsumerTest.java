package com.lambda.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTest {

    @Test
    public void test1() {
        Consumer<String> consumer = a -> {
            if (Objects.isNull(a)) {
                System.out.println("arg a can be empty");
                return;
            }
            System.out.println(a);
        };

        StringConsumer lambdaFunc = new StringConsumer("Lambda Func");
        lambdaFunc.stringConsumer(consumer);
    }

    @Test
    public void test2() {
        Function<String, String> identity = Function.identity();
        String value = identity.apply("function identify");
        System.out.println(value);
    }


    @Test
    public void test3() {
        Consumer<String> consumer = a -> {
            if (Objects.isNull(a)) {
                System.out.println("arg a can be empty");
                return;
            }
            System.out.println("arg is not empty");
        };
        Consumer<String> stringConsumer = consumer.andThen(System.out::println);

        stringConsumer.accept("consumer andThen");
    }

    @Test
    public void test4() {

        class indexObj {
            int i;
        }
        indexObj obj = new indexObj();
        //  final AtomicInteger i = new AtomicInteger(0);
        BiConsumer<Integer, String> biConsumer = (Integer a, String str)
                -> System.out.println(a + "  " + str);
        List<String> stringList = getStringList1();
        stringList.forEach(item -> biConsumer.accept(obj.i++ , item));


    }
    @Test
    public void test401() {

        final int[] i = {0};
        //  final AtomicInteger i = new AtomicInteger(0);
        BiConsumer<Integer, String> biConsumer = (Integer a, String str)
                -> System.out.println(a + "  " + str);
        List<String> stringList = getStringList1();
        stringList.forEach(item -> biConsumer.accept(i[0]++ , item));


    }

    @Test
    public void test5() {
        int i = 0;
        for (int j = 0; j < 3; j++) {
            System.out.println(i = i++);
        }
        System.out.println(i);
    }

    @Test
    public void test6() {
        int i = 0;
        for (int j = 0; j < 3; j++) {
            System.out.println(i++);
        }
        System.out.println(i);
    }

    @Test
    public void test7() {
        int i = 0;
        for (int j = 0; j < 3; j++) {
            System.out.println(++i);
        }
        System.out.println(i);
    }

    public static List<String> getStringList1() {
        return Arrays.asList("a", "b", "b");
    }

}
