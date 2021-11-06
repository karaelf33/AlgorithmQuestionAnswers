package com.example.algoritma.algorithmAnswers;

public class StairCase {

    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("#");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        staircase(6);
    }
}
