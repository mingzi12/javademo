package com;

public class TestString {

    public static void main(String[] args) {
       /* System.out.println("xxxxxxxx");

        String[] players = new String[]{"Kobe", "Mike"};
        System.out.println(players);*/
        String string = "We Are  Happy.";
        String string1 = string.replace(" ", "%20");
        System.out.println(string1);
        //printStr("ABC");
    }


    public static void printStr(String str) {
        int len = str.length();
        for (int i=0; i<len; i++) {
            String s = String.valueOf(str.charAt(i));
            StringBuffer buffer = new StringBuffer(str);
            buffer.deleteCharAt(i);
            System.out.println(s + buffer);
            printStr(s, buffer.toString());
        }
    }

    public static void printStr(String start, String str) {
        int len = str.length();
        for (int i=0; i<len; i++) {
            String s = String.valueOf(str.charAt(i));
            StringBuffer buffer = new StringBuffer(str);
            buffer.deleteCharAt(i);
            if (i != 0)
                System.out.println(start + s + buffer);
            printStr(start + s, buffer.toString());
        }
    }

}
