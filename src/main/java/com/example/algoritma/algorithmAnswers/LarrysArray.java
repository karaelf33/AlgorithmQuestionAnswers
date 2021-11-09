package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LarrysArray {

    public static String larrysArray(List<Integer> a) {
        return sorted(a);
    }

    private static String sorted(List<Integer> a) {
        if (a.equals(a.stream().sorted().collect(Collectors.toList()))) {
            return "YES";
        }
        List<Integer> temp = new ArrayList<>(a);


        for (int i = 0; i < a.size() - 2; i++) {
            getFirstToEndOfList(a.subList(i, i + 3));
        }
        return temp.equals(a) ? "NO" : sorted(a);

    }

    public static void getFirstToEndOfList(List<Integer> subList) {
        if (subList.get(0) > subList.get(1) || subList.get(0) > subList.get(2)) {
            Collections.rotate(subList, -1);
            getFirstToEndOfList(subList);
        }

    }


    public static void main(String[] args) {
        List<Integer> isListSuitableForSorting = new ArrayList<>();
        isListSuitableForSorting.add(1);
        isListSuitableForSorting.add(6);
        isListSuitableForSorting.add(5);
        isListSuitableForSorting.add(2);
        isListSuitableForSorting.add(4);
        isListSuitableForSorting.add(3);

        System.out.println(larrysArray(isListSuitableForSorting));


    }

}
