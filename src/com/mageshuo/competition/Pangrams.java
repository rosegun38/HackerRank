package com.mageshuo.competition;

import java.util.Scanner;

/**
 * Created by majian on 8/7/16.
 */

public class Pangrams {
    public static int[] results = new int[26];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (isPangrams(s)) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }

    public static boolean isPangrams(String s) {
        String newString = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if (newString.charAt(i) != ' ') {
                int index = newString.charAt(i) - 97;
                results[index] += 1;
            }
        }
        for(int i = 0; i < 26; i++) {
            if (results[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
