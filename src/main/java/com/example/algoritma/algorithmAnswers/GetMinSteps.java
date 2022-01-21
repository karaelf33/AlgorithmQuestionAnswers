package com.example.algoritma.algorithmAnswers;

public class GetMinSteps {

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

    public static void main(String[] args) {
        int n = 1000;
        System.out.println(getMinStepsWithMemoization(1000, new int[n + 1]));
    }
}
