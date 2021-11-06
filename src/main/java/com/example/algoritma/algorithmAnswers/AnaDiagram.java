package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class AnaDiagram {

    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
        // Write your code here
        List<Integer> listOfDifferences=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
           listOfDifferences.add(stringCompare(a.get(i), b.get(i)));
        }
        return listOfDifferences;
    }

    public static int stringCompare(String textA, String textB) {
        int numberOfDifferences = 0;
        if (textA.length() == textB.length()) {
            for (int i = 0; i < textA.length(); i++) {
                if (!textB.contains(Character.toString(textA.charAt(i)))) {
                    numberOfDifferences++;
                }
            }
            return numberOfDifferences;

        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("aac");
        a.add("jk");
        a.add("abb");
        a.add("mn");
        a.add("abc");
        List<String> b = new ArrayList<>();
        b.add("bba");
        b.add("kj");
        b.add("bbc");
        b.add("op");
        b.add("def");
        for (int i=0;i<getMinimumDifference(a,b).size();i++){
            System.out.println(getMinimumDifference(a,b).get(i));
        }

    }
}
