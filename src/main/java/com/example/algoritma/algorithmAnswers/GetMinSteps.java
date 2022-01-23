package com.example.algoritma.algorithmAnswers;

import java.util.Arrays;

public class GetMinSteps {

    public static void tableFill(int n) {
        int[] table = new int[n + 1];
        Arrays.fill(table, n);
        System.out.println(table);

    }

    public static int getMinSteps(int n) {
        if (n == 1) return 0;
        int result = getMinSteps(n - 1);
        if (n % 2 == 0) {
            result = Math.min(result, getMinSteps(n / 2));
        }
        if (n % 3 == 0) {
            result = Math.min(result, getMinSteps(n / 3));
        }
        return result + 1;
    }

    public static int getMinStepsWithMemoization(int n, int[] memo) {
        if (n == 1) return 0;
        if (memo[n] != 0) {
            return memo[n];
        }
        int result = getMinStepsWithMemoization(n - 1, memo);
        if (n % 2 == 0) {
            result = Math.min(result, getMinStepsWithMemoization(n / 2, memo));
        }
        if (n % 3 == 0) {
            result = Math.min(result, getMinStepsWithMemoization(n / 3, memo));
        }
        memo[n] = result + 1;
        return memo[n];
    }


    public static int getMinStepWithTabulation(int n) {
        int[] table = new int[n + 1];
        Arrays.fill(table, n);
        table[1] = 0;

        for (int i = 1; i < n; i++) {
            table[i + 1] = Math.min(table[i + 1], table[i] + 1);
            if (i * 2 <= n)
                table[i * 2] = Math.min(table[i] + 1, table[i * 2]);
            if (i * 3 <= n) {
                table[i + 1] = Math.min(table[i] + 1, table[i * 3]);
            }
        }

        return table[n];
    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(getMinStepWithTabulation(n));
        // System.out.println(getMinStepsWithMemoization(1000, new int[n + 1]));
    }
}
