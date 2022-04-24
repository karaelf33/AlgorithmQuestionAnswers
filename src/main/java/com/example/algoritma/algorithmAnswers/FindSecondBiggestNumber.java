package com.example.algoritma.algorithmAnswers;

public class FindSecondBiggestNumber {
    public static int findSecond(int[] n) {
        int second = Integer.MIN_VALUE;
        int first = n[0];
        for (int i = 1; i < n.length; i++) {
            if (first < n[i]) {
                second = first;
                first = n[i];
            }
        }
        return second;
    }

}
