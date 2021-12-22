package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < s.size() - 1; i++) {
        }
        combinations(s.size(), s);
        return 1;
    }

    public static void combinations(int n, List<Integer> integerList) {
        if (n==0) return;
        if (n==1) return;
        System.out.println(integerList.get(n-1)+integerList.get(n-2));
        combinations(n-1,integerList);
        combinations(n-2,integerList);

      //  return combinations(n-1,integerList)+combinations(n-2,integerList);
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(4);
        nonDivisibleSubset(3, list);
    }
}
