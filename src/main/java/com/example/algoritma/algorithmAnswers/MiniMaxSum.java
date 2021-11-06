package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {

        long minSum = 0, maxSum = 0, sum = 0;
        minSum = arr.get(0);
        maxSum = arr.get(0);
        for (Integer integer : arr) {
            sum += integer;
            if (integer < minSum) {
                minSum = integer;
            }
            if (integer > maxSum) {
                maxSum = integer;
            }
        }
        System.out.println((sum - maxSum) + " " + (sum - minSum));

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        int[] arr2 = {1, 43, 53, 6, 9, 12};
        miniMaxSum(arr);

    }
}
