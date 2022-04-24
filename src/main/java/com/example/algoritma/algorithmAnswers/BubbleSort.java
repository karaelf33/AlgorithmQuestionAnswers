package com.example.algoritma.algorithmAnswers;


import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void bubleSort(int[] n) {
        boolean isSort = true;
        while (isSort) {
            isSort = true;
            for (int i = 0; i < n.length; i++) {
                int first;
                if (n[i] > n[i + 1]) {
                    first = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = first;
                    isSort = false;
                }

            }

        }
    }


    public static void main(String[] args) {

    }
}
