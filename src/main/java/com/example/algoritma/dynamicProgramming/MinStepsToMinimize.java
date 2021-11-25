package com.example.algoritma.dynamicProgramming;

import java.util.Arrays;

public class MinStepsToMinimize {

    static int getMinStepsTab(int n) {
        int[] table=new int[n+1];
        Arrays.fill(table,n);
        System.out.println(Arrays.toString(table));
        return 1;
    }

     int f(int n){
        System.out.println(n);
        if (n>1){
            f(n-1);
        }
        return 1;
    }

    public static void main(String[] args) {
      //  getMinStepsTab(10);

    }


}
