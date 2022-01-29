package com.example.algoritma.dynamicProgramming.tabulation;


import java.util.Arrays;

public class TabulationExplain {
    // Fib index    = 0 1 2 3 4 5 6 7  8  9  10.... 30
    // Fib sequence = 0 1 1 2 3 5 8 13 21 34 55 ...
    // Bottom-Up approach
// O(n)

    public static int fibWithTabulation(int n) {
        int[] table = new int[n + 1];
        // base case
        table[1] = 1;
        System.out.println(Arrays.toString(table));
        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        System.out.println(Arrays.toString(table));


        return table[n];
    }

    public static void main(String[] args) {
        System.out.println(fibWithTabulation(10));
        ;
    }
}
