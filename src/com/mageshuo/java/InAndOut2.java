package com.mageshuo.java;

import java.util.Scanner;

/**
 * Created by majian on 8/14/16.
 * Please leave this header if you want to use the code.
 */
public class InAndOut2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
