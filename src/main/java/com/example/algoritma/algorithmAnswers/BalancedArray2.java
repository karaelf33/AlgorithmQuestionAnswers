package com.example.algoritma.algorithmAnswers;

public class BalancedArray2 {

    static int solve(int[] a) {
        int halfSize = a.length / 2;
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < halfSize; i++) {
            leftSum += a[i];
            rightSum +=a[i+halfSize];
        }
        return Math.abs(rightSum - leftSum);

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 1, 3};
        System.out.println(solve(arr));
    }
}
