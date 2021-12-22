package com.example.algoritma.dynamicProgramming;

public class ReverseString {

    public static String reverseString(String n) {
        if (n.isEmpty()) {
            System.out.println("sffdsd");
            return n;
        } else {
            return reverseString(n.substring(1)) + n.charAt(0);

        }

    }

    public static String reverseStrin2(String str) {
        if (str.isEmpty()) {
            System.out.println("String is empty.");
            return str;
        } else {
            return reverseStrin2(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String n = "Hello";
        System.out.println(n.substring(1));
        System.out.println(n.charAt(0));
        System.out.println(reverseString("Hello"));
    }
}
