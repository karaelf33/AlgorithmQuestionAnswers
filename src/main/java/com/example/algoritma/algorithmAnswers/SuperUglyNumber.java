package com.example.algoritma.algorithmAnswers;

import java.util.Arrays;

public class SuperUglyNumber {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] sorted = new int[array.length];
        int start = 0, end = array.length - 1;
        int a=Integer.MIN_VALUE;

        for (int i=array.length-1;i>=0;i--) {

            if (Math.abs(array[start]) > Math.abs(array[end])) {
                sorted[i] = array[start] * array[start];
                start++;
            } else {
                sorted[i] = array[end] * array[end];
                end--;
            }


        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-5, -4, -3, -2, -1};
        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }
}
