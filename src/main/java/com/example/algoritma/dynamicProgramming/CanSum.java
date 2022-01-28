package com.example.algoritma.dynamicProgramming;

import java.util.Arrays;

public class CanSum {

    public static boolean canSum(int targetSum, int[] numbers) {
        boolean[] table = new boolean[targetSum + 1];
        Arrays.fill(table, false);
        table[0] = true;
        return true;
    }


    public static void main(String[] args) {

    }
}
