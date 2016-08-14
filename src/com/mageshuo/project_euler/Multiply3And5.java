package com.mageshuo.project_euler;

import java.util.Scanner;

/**
 * Created by majian on 8/8/16.
 * Please leave this header if you want to use the code.
 */

public class Multiply3And5 {
    public static int[] input;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        input = new int[t];
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            input[i] = n;
        }
        printOutput();
    }

    public static void printOutput() {
        for(int n: input) {
            System.out.println(getSumOfMultiples(n));
        }
    }

    public static long getSumOfMultiples(int n) {
        long result;
        long sumOfThree = getFactorCount(n, 3);
        long sumOfFive = getFactorCount(n, 5);
        long sumOfFifteen = getFactorCount(n, 15);
        result = sumOfThree + sumOfFive - sumOfFifteen;
        return result;
    }

    public static long getFactorCount(int n, int factor) {
        if (n < factor) {
            return 0;
        }
        int result = factor;
        long multiplesCount = 0;
        while (result < n) {
            multiplesCount = multiplesCount + result;
            result = result + factor;
        }
        return multiplesCount;
    }

}
