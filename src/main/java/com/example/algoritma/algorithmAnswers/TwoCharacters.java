package com.example.algoritma.algorithmAnswers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoCharacters {

    public static int alternate(String s) {
        // Write your code here
        StringBuilder stringBuilder = new StringBuilder(s);
        Set<Character> consecutive = new HashSet<>();
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length() - 1; i++) {
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                consecutive.add(stringBuilder.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!consecutive.contains(stringBuilder.charAt(i))) {
                list.add(stringBuilder.charAt(i));

                if (charCount.containsKey(stringBuilder.charAt(i))) {
                    int val = charCount.get(stringBuilder.charAt(i)) + 1;
                    charCount.put(stringBuilder.charAt(i), val);
                } else {
                    charCount.put(stringBuilder.charAt(i), 1);
                }
            }
        }

        if (charCount.size() > 2) {
            int removeCharCount=charCount.size()-2;
            // can not delete char
            for (int i=1;i<list.size()-1;i++){
                if (list.get(i-1).equals(list.get(i+1))){
                    charCount.remove(list.get(i));
                }
            }


            System.out.println(charCount);
        } else {
            return list.size();
        }


        System.out.println(charCount);
        System.out.println(list);
        System.out.println(consecutive);
        // delete item whose left and right side are not same


        return 1;
    }

    public static void main(String[] args) {
        alternate("beabeefeabeekk");
        // System.out.println(alternate("beabeefeabee"));
    }
}
