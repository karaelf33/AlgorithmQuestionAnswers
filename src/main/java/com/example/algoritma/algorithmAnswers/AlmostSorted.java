package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlmostSorted {

    public static void almostSorted(List<Integer> arr) {
    }

    public static void findMisMatchValues(List<Integer> arr) {
        int start = -1, end = -1, count = 0, len = arr.size();
        List<Integer> sortedArray = arr.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < len; i++) {
            if (arr.get(i).equals(sortedArray.get(i))) {
                if (start == -1) start = i;
                else end = i;
                count++;
            }
        }
        if (count == 2) {
            int firstPoint = start + 1;
            int secondPoint = end + 1;
            System.out.println("yes");
            System.out.println("swap" + firstPoint + " " + secondPoint);
            swap(arr, start, end);
        } else if (count > 2) {
            //  reverse();
        }
    }

    public static void swap(List<Integer> arr, int i, int j) {
        final List l = arr;
        l.set(i, l.set(j, l.get(i)));
    }

    public static void reverse(List<Integer> arr) {
        // IntStream.range(start,end).map()

    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(6);


        // System.out.println(isArrSorted(arr));
        almostSorted(arr);


    }
}
