package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxNumber = 0, max = 0;

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == max) {
                maxNumber++;
            }
            if (candles.get(i) > max) {
                max = candles.get(i);
                maxNumber = 1;
            }
        }


        return maxNumber;
    }

    public static void main(String[] args) {

        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        System.out.println(birthdayCakeCandles(candles));

    }
}
