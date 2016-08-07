package com.mageshuo;

import java.util.Scanner;

/**
 * Created by majian on 8/7/16.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.length() < 1 || s.length() > 100000) {
            return;
        }
        System.out.println(countWords(s));
    }

    public static int countWords(String s) {
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                count += 1;
            }
        }
        return count;
    }
}
