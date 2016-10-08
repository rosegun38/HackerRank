package com.mageshuo.competition;

import java.util.Scanner;

/**
 * Created by majian on 9/7/16.
 * Please leave this header if you want to use the code.
 */
public class StairCase {
    static  String s = "";
    static  String blank;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        StairCase(_n);

    }
    static void StairCase(int n) {

        for(int i = 0; i < n; i++) {
            s = s + "#";
            System.out.println(s);
        }
    }


}
