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
            for (int i=0;i<chars.length;i++){
                   if (!repeatsMatch.containsKey(String.valueOf(chars[i]))){
                       repeatsMatch.put(String.valueOf(chars[i]),1);
                   }else {
                       Integer count=repeatsMatch.get(String.valueOf(chars[i]));
                       repeatsMatch.put(String.valueOf(chars[i]),++count);
                   }


            }
            System.out.println(repeatsMatch);
            for (int i=0;i<chars.length;i++){
                if (!stringBuilder.toString().isEmpty() || String.valueOf(chars[i]).equals(" ")){
                    stringBuilder.append(chars[i]);
                }
                else if (repeatsMatch.get(String.valueOf(chars[i]))<repeats){
                    stringBuilder.append(chars[i]);
                }
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeRedundant("aaba kouq bux",2));
    }
}
