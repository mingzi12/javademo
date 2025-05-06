package com.math;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaTest {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int i = 0;
        while (scanner.hasNextLine()) {
            String goodsStr = scanner.nextLine();
            Set<Integer> goodsSet = new TreeSet<>();

            String[] goods = goodsStr.split(",");
            for (String good : goods) {
                if (!"".equals(good)) {
                    goodsSet.add(Integer.parseInt(good));
                }

            }
            int carCapacity = 0;
            if (scanner.hasNextLine()) {
                carCapacity = scanner.nextInt();
            }

            Iterator<Integer> iterator = goodsSet.iterator();
            while (total <= carCapacity && iterator.hasNext()) {
                total += iterator.next();
                if (total > 20) {
                    break;
                }
                i++;
            }
            System.out.print(i);
        }
    }*/


    //97 a
    //122 z
    //48 0
    //57 9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[0-9a-z]$+");

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            boolean isValid = matcher.find();
            if (!isValid) {
                System.out.println("!error");
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '0' && i == 0) {
                    System.out.print("!error");
                    break;
                }
                if (str.length() == 1) {
                    System.out.print(str);
                    break;
                }

                if (c == '0' && i < str.length() - 2) {
                    if ('0' == str.charAt(i - 1) || '0' == str.charAt(i + 1)) {
                        System.out.print("!error");
                        break;
                    }
                }
                if (str.charAt(str.length() - 1) >= 48 && str.charAt(str.length() - 1) <= 57) {
                    System.out.print("!error");
                    break;
                }

                if ((c == '1' || '2' == str.charAt(i)) && (str.charAt(i + 1) > 57)) {
                    System.out.print("!error");
                    break;
                }

                if (c >= 48 && c <= 57) {
                    if (str.charAt(i + 1) >= 48 &&  str.charAt(i + 1) <= 57) {
                        for (int j = 0; j < Integer.parseInt(str.substring(i, i +2)); j++) {
                            System.out.print(str.charAt(i + 1));
                        }
                        i += 2;
                        continue;
                    }
                    for (int j = 0; j < Integer.parseInt(str.substring(i, i+1)); j++) {
                        System.out.print(str.charAt(i + 1));
                    }
                    i++;
                    continue;
                }
                System.out.print(c);
            }
            System.out.println();
        }

    }

    @Test
    public void ma() {
        int a = '0';
        int z = '9';
        String str = "10nbb";
        if('2' == '2') {
            System.out.println("=====");
        }
        if('0' == 48) {
            System.out.println("48=====");
        }
        System.out.println(str);
        System.out.println(a);
        System.out.println(z);
        System.out.println(Integer.parseInt(str.substring(0, 2)));
    }

    @Test
    public void pp() {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[0-9a-z]+]");

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            boolean isValid = matcher.find();
            if (!isValid) {
                System.out.print("!error");
            }
        }
    }

    @Test
    public void pp1() {
        /*
            Pattern pattern = Pattern.compile("^[0-9a-z]");
            String str = "Q2scanner.nextLine()";
            Matcher matcher = pattern.matcher(str);
            boolean isValid = matcher.find();
            */

            String str = "2scanner.nextLine()";
            boolean isValid = str.matches("^[0-9a-z]");
            if (!isValid) {
                System.out.print("!error");
            }
    }

    @Test
    public void pp2() {
        /*
            Pattern pattern = Pattern.compile("^[0-9a-z]");
            String str = "Q2scanner.nextLine()";
            Matcher matcher = pattern.matcher(str);
            boolean isValid = matcher.find();
            */

            String str = "2scanner.nextLine()";
            boolean isValid = str.matches("^[0-9][a].*");
            //boolean isValid = Pattern.matches("(\\d+)(.*)", str);
            if (!isValid) {
                System.out.print("!error");
            }
    }

    @Test
    public void p1() {
        int a =4;
        int b =0;
       try {
           int c = a/b;
       } catch (Exception e) {
           System.out.println("exception");
       } finally {
           System.out.println("finally");
       }
       }

    @Test
    public void p2() {
        char char1 = 'a';
        System.out.println(char1);
        int char1Num = char1;
        System.out.println(char1Num);

        int char2 = 'A';
        System.out.println((int)char2);

        String str1 = "asdfaA";
        System.out.println(str1.lastIndexOf('A'));

    }


    @Test
    public void p3() {
        double b1 = 1.0;
        String abc = "abc";
        StringBuilder builder = new StringBuilder(abc);
        String s = builder.append(b1).toString();
        System.out.println(s);
        System.out.println(builder.insert(2, 'e'));


    }


}

