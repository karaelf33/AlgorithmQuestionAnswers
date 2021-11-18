package com.example.algoritma.algorithmAnswers;

import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (Integer integer : ar) {
            sum = integer + sum;
        }
        return sum;

    }

    public void convertIntToString(int n) {
        String s = Integer.toString(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }

    public static void main(String[] args) {

    }
}
