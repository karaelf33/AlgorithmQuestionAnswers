package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

        int applesIncluded = 0, orangesIncluded = 0;
        for (Integer apple : apples) {
            if (s <= apple + a && t >= apple + a) {
                applesIncluded++;
            }
        }
        for (Integer orange : oranges) {
            if (s <= orange + b && t >= orange + b) {
                orangesIncluded++;
            }
        }
        System.out.println(applesIncluded);
        System.out.println(orangesIncluded);


    }

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        List<Integer> oragens = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        oragens.add(5);
        oragens.add(-6);
        countApplesAndOranges(7, 11, 5, 15, apples, oragens);
    }
}

/*
        7 11
        5 15
        3 2
        -2 2 1
        5 -6*/
