package com.example.algoritma.algorithmAnswers;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructbileChange(int[] coins) {
        Arrays.sort(coins);

        int charge = 0;
        for (int coin : coins) {
            if (coin > charge + 1) {
                return charge + 1;
            }
            charge += coin;
        }

        return charge + 1;
    }

    public static void main(String[] args) {

        int[] coins = {5, 7, 1, 1, 2, 3, 19, 38, 25, 102, 103};
        int[] sortCoint = {1, 1,1, 2,6};
        System.out.println(nonConstructbileChange(sortCoint));
        int[] buyCoints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};


        int[] buyCoints1 = {1, 2, 3, 4, 5, 6, 7};

    }
}
