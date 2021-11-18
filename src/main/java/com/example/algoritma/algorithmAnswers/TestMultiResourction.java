package com.example.algoritma.algorithmAnswers;

public class TestMultiResourction {

    public static String test(String a,int n){


        if (n==30){
            return "c";
        }

        return test(a,n=n+1)+test("b",2*n);
    }

    public static void fun(int n){
        if (n>=2){
            fun(n-1);
            fun(n-2);
            fun(n-3);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println(test("k",2));
    }
}
