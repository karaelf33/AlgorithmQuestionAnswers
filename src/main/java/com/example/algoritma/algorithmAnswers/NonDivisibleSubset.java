package com.example.algoritma.algorithmAnswers;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.IntStream;

public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {

        Set<Integer> permutations = new HashSet<>();
        for (int i = 0; i < s.size(); i++) {
            for (int j = 1; j < s.size(); j++) {
                if ((s.get(i) + s.get(j)) % k != 0 && i!=j) {
                    System.out.println(s.get(i) +"+" + s.get(j)+ "=" +""+(s.get(i)+s.get(j)));
                    permutations.add(s.get(i));
                }
            }

        }
        System.out.println(permutations);

        return permutations.size();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(7);

        list.add(2);
        list.add(4);
        System.out.println(nonDivisibleSubset(3, list));
    }
}
