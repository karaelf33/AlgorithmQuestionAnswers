package com.example.algoritma.dynamicProgramming;

import java.time.LocalDateTime;

public class Foo {

    public static void foo(int n) {
        if (n <= 1) {
            return;
        }
        // System.out.println(n);
        foo(n - 1);
    }


    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        foo(11200);
        System.out.println(LocalDateTime.now());
    }
}
