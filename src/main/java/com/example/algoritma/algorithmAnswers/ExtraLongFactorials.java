package com.example.algoritma.algorithmAnswers;

import java.math.BigInteger;

public class ExtraLongFactorials {


    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            BigInteger m = new BigInteger(String.valueOf(i));
            result = result.multiply(m);
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
