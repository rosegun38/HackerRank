package com.mageshuo.java;

import java.util.Scanner;

/**
 * Created by majian on 8/14/16.
 * Please leave this header if you want to use the code.
 */
public class JavaOutputFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x = sc.nextInt();
            int size = s1.length();
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");

    }

}
