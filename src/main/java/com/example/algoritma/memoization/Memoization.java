package com.example.algoritma.memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Memoization {
    //  memoization != memorize
    // Fin index    = 1 2 3 4 5 6 7  8  9.... 30
    // Fib sequence = 1 1 2 3 5 8 13 21 34 ...
    // recursion fun
    // time 2^n;
    // with n

    // Tabulation Recipe
    //

    public static int fib(int n) {
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static Map<Integer, Integer> memo = new HashMap<>();

    public static void memoOperation() {
        System.out.println(fibWithMemo(30));
    }

    public static long fibWithMemo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long result = fibWithMemo(n - 1) + fibWithMemo(n - 2);
            memo.put(n, (int) result);
            return result;
        }
    }


    public static long fibWithTabulation(int n) {
        long[] table = new long[n + 1];
        table[1] = 1;
        table[2] = 1;
        for (int i = 3; i <= n; i++) {
            table[i] += table[i - 1] + table[i - 2];

        }
        return table[n];
    }


    public static void main(String[] args) {
        memoOperation();
        System.out.println( fibWithTabulation(50));
    }


}
