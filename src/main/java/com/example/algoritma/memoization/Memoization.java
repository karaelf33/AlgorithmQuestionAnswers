package com.example.algoritma.memoization;

import java.util.HashMap;
import java.util.Map;

public class Memoization {
    //  memoization != memorize
    // Fin index    = 1 2 3 4 5 6 7  8  9.... 30
    // Fib sequence = 1 1 2 3 5 8 13 21 34 ...
    // recursion fun
    // time 2^n;
    // with n

    public static int fib(int n) {
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static Map<Integer, Integer> memo = new HashMap<>();

    public static void memoOperation() {
        memo.put(1, 1);
        memo.put(2, 1);
        System.out.println(fibWithMemo(50));
    }

    public static long fibWithMemo(int n) {

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long result = fibWithMemo(n - 1) + fibWithMemo(n - 2);
            memo.put(n, (int) result);
            return result;
        }
    }

    public static void main(String[] args) {
        //System.out.println(fib(50));
        memoOperation();
    }


}
