package com.mageshuo.competition;

import java.util.Scanner;

/**
 * Created by majian on 8/8/16.
 */
public class CookieParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (!isValid(m) || !(isValid(m))) {
            return;
        }
        int result;
        if (m % n == 0) {
            result = 0;
        } else {
            result = n - (m % n);
        }
        System.out.println(result);
    }


    public static boolean isValid(long m) {
        if (m < 1 || m > 1000000000L) {
            return false;
        }
        return true;
    }
}
