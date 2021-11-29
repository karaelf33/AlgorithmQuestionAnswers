package com.example.algoritma.dynamicProgramming;

public class ReverseString {

    public static String reverseString(String n) {
        if (n.isEmpty()){
            System.out.println("sffdsd");
            return n;
        }else {
            return reverseString(n.substring(1) + n.charAt(0));

        }

    }


    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }
}
