package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Knapsack {


    //bad way
    public static int unboundedKnapsack(int k, List<Integer> arr) {
        // Write your code here

        return nearestCapacity(arr, k, arr.size() - 1, 0);
    }

    public static int nearestCapacity(List<Integer> integerList, int c, int n, int result) {
        if (n == 0) {
            return result;
        }
        if (c == 0) {
            return 0;
        } else if (integerList.get(n) > c) {
            result = nearestCapacity(integerList, c, n - 1, result);
        } else {
            int temp1 = nearestCapacity(integerList, c, n - 1, result);
            int temp2 = integerList.get(n) + nearestCapacity(integerList, c - integerList.get(n), n - 1, result);
            result = Math.max(temp1, temp2);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        unboundedKnapsack(235, arr);

    }
}
