package com.example.algoritma.algorithmAnswers;

public class MultiplyString {

    public static String multiply(String num1, String num2) {
        long a=convertStringToLong(num1) * convertStringToLong(num2);
        System.out.println(a);
        System.out.println(String.valueOf(convertStringToLong(num1) * convertStringToLong(num2)));
        return String.valueOf(convertStringToLong(num1) * convertStringToLong(num2));
    }

    private static long convertStringToLong(String str) {
        int convertedInt = 0;
        int i = str.length() - 1;
        int exponent = 0;
        while (i >= 0) {
            int digit = Character.digit(str.charAt(i), 10);
            int ans = (int) Math.pow(10, exponent);
            digit = digit * ans;
            convertedInt = convertedInt + digit;
            i--;
            exponent++;
        }
        return convertedInt;
    }

    public static void main(String[] args) {
        multiply("6913259244", "71103343");
    }
}
