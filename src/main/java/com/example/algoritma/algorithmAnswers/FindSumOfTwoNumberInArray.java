package com.example.algoritma.algorithmAnswers;

import java.util.Arrays;

public class FindSumOfTwoNumberInArray {

    public static boolean hasPairWithSum(int[] arr, int sum) {

        int[] sorted = Arrays.stream(arr).sorted().toArray();
        int low = 0;
        int high = sorted.length - 1;
        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                return true;
            }
            low++;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
