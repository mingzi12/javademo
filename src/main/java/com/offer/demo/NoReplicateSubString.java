package com.offer.demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoReplicateSubString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            Set<String> subSet = show(s);
            System.out.println(subSet.size());
        }
    }

    /**
     * 求字符串不重复的子串集合
     *
     * @param str 字符串
     * @return 不重复的子串集合
     */
    public static Set<String> show(String str) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }
        return set;
    }


}
