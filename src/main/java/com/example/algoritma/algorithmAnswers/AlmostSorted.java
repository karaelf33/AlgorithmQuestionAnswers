package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AlmostSorted {

    public static void almostSorted(List<Integer> arr) {
        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
        if (arr.equals(arr.stream().sorted().collect(Collectors.toList()))) {
            System.out.println("yes");
        }

        List<Integer> indexesOfDiffItems = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals(sortedList.get(i))) {
                indexesOfDiffItems.add(i);
            }
        }
        int lastIndex = indexesOfDiffItems.get(indexesOfDiffItems.size() - 1) + 1;
        int firstIndex = indexesOfDiffItems.get(0) + 1;
        if (indexesOfDiffItems.size() == 2) {

            int secondIndex = indexesOfDiffItems.get(1) + 1;
            System.out.println("yes");
            System.out.println("swap " + firstIndex + " " + secondIndex);
        } else {
            Collections.reverse(arr.subList(indexesOfDiffItems.get(0), indexesOfDiffItems.get(indexesOfDiffItems.size() - 1) + 1));
            if (arr.equals(sortedList)) {
                System.out.println("yes");
                System.out.println("reverse " + firstIndex + " " + lastIndex);
            } else {
                System.out.println("no");
            }
        }
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        arr.add(5);
        arr.add(6);

        almostSorted(arr);

    }
}
