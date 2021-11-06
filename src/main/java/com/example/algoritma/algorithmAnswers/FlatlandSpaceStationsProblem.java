package com.example.algoritma.algorithmAnswers;

import java.util.Arrays;
import java.util.HashMap;

public class FlatlandSpaceStationsProblem {

    // n=> number of cities
    // c >spaces


    static int flatlandSpaceStations(int n, int[] c) {

        Arrays.sort(c);
        int max = c[0];

        for (int i = 1; i < c.length; i++) {
            int diff = (c[i] - c[i - 1]) / 2;
            max = Math.max(max, diff);
        }
        return Math.max(max, n - c[c.length - 1] - 1);
    }

    public static void main(String[] args) {

        int n = 11;
        int[] c = {5, 9};

        System.out.println(flatlandSpaceStations(n, c));
    }
}
