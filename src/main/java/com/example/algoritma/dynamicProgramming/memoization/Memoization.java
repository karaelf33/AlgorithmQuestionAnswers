package com.example.algoritma.dynamicProgramming.memoization;

import java.util.HashMap;
import java.util.Map;

public class Memoization {
    //  memoization != memorize
    // Fin index    = 0 1 2 3 4 5 6 7  8  9.... 30
    // Fib sequence = 0 1 1 2 3 5 8 13 21 34 ...
    // recursion fun
    // time 2^n;
    // with n


    public static int fib(int n) {
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static Map<Integer, Integer> memo = new HashMap<>();

    public static void memoOperation() {
        System.out.println(fibWithMemo(30));
    }

    public static int fibWithMemo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int result = fibWithMemo(n - 1) + fibWithMemo(n - 2);
            memo.put(n, result);
            return result;
        }
    }





    public static void main(String[] args) {
        memoOperation();
    }


}
