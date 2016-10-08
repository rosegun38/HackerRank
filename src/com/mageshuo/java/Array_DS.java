package com.mageshuo.java;

import java.util.Scanner;

/**
 * Created by majian on 08/10/2016.
 * Please leave this header if you want to use the code.
 */
public class Array_DS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Array_DS.printReverse(arr);
    }

    static private void printReverse(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
