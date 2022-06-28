package com.example.algoritma.algorithmAnswers;

import java.util.*;

public class NumOfPairs {

    public static int numOfPairs(String[] nums, String target) {

        Map<String, Integer> numsItem = new HashMap<>();
        int targetLength = target.length(), result = 0;
        String left, right;
        int countOfLeft, countOfRight;

        for (String num : nums) {
            numsItem.put(num, numsItem.getOrDefault(num, 0) + 1);
        }

        for (int j = 1; j < targetLength; j++) {
            left = target.substring(0, j);
            right = target.substring(j, targetLength);

            countOfLeft = numsItem.getOrDefault(left, 0);
            countOfRight = left.equals(right) ? (countOfLeft - 1) : numsItem.getOrDefault(right, 0);
            result += countOfLeft * countOfRight;

        }
        return result;
    }



    public static void main(String[] args) {
        String[] a = new String[]{"123", "4", "12", "34"};
        numOfPairs(a, "1234");
    }
}
