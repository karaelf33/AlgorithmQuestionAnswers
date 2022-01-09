package com.example.algoritma.algorithmAnswers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class REmoveRedundant {

    public static String removeRedundant(String text, Integer repeats) {
        char[] chars =text.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        Map<String,Integer> repeatsMatch=new HashMap<>();
        if (text.length()>0){
            for (char aChar : chars) {
                if (!repeatsMatch.containsKey(String.valueOf(aChar))) {
                    repeatsMatch.put(String.valueOf(aChar), 1);
                } else {
                    Integer count = repeatsMatch.get(String.valueOf(aChar));
                    repeatsMatch.put(String.valueOf(aChar), ++count);
                }


            }
            for (char aChar : chars) {
                if (!stringBuilder.toString().isEmpty() || String.valueOf(aChar).equals(" ")) {
                    stringBuilder.append(aChar);
                } else if (repeatsMatch.get(String.valueOf(aChar)) < repeats) {
                    stringBuilder.append(aChar);
                }
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeRedundant("aaba kouq bux",2));
    }
}
