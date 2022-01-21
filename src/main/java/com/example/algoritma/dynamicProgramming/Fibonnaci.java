package com.example.algoritma.dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fibonnaci {

    //
    public static long[] arr = new long[100];


    public static int fib(int n) {
        long val=0;
        if(n==0){return 0;}
        else if(n==1){return 1;}
        else if(arr[n] !=0){return (int) arr[n];}
        else{
            val=fib(n-1)+fib(n-2);
            return (int) val;
        }
    }


    public static int fibWithoutRecursive(int n) {
        int point = 1;
        for (int i = 2; i <= n; i++) {
            point = point + i;
        }
        return point;
    }

    public static void main(String[] args) {
        System.out.println(fib(50));
        //    System.out.println(fibWithoutRecursive(64));
    }
}
