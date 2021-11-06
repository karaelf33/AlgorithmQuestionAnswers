package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        double minusNumber = 0, zeroNumber = 0, plusNumber = 0;
        for (Integer integer : arr) {
            if (integer < 0) {
                minusNumber++;
            } else if (integer > 0) {
                plusNumber++;
            } else {
                zeroNumber++;
            }
        }
        System.out.println(minusNumber / arr.size());
        System.out.println(plusNumber / arr.size());
        System.out.println(zeroNumber / arr.size());

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        plusMinus(arr);
    }
}
