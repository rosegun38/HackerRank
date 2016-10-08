package com.mageshuo.java;

import java.util.Scanner;

/**
 * Created by majian on 8/16/16.
 * Please leave this header if you want to use the code.
 */
public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println( N + " x " + i + " = " +  N * i);
        }
    }
}
