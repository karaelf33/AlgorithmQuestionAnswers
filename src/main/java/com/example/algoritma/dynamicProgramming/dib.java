package com.example.algoritma.dynamicProgramming;

import java.time.LocalDateTime;

public class dib {

    public static void dib(int n){
        if (n<=1) return;
        dib(n-1);
        dib(n-1);
    }

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        dib(5);
        System.out.println(LocalDateTime.now());

    }
}
