package com.example.algoritma.dynamicProgramming.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Fibonacci {
    //  memoization != memorizaion
    // Fin index    = 1 2 3 4 5 6 7  8  9
    // Fib sequence = 1 1 2 3 5 8 13 21 34 ...
    // O(2^n) n^2

    public static long fib(int n) {
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static Map<Integer, Integer> memo = new HashMap<>();

    public static void test() {
        memo.put(0, 1);
        memo.put(1, 1);
        System.out.println(fibMemo(50));
    }


    public static long fibMemo(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long result =  (fibMemo(n - 1) + fibMemo(n - 2));
            memo.put(n, (int) result);
            return result;
        }
    }


    public static void main(String[] args) {
        double DoubleValue = 0.50000;
        int IntValue = (int) Math. round(DoubleValue);
        System.out.println(IntValue);
      //  fib(70);
     //   test();
    }

}
