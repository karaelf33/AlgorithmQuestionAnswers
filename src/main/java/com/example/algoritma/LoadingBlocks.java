package com.example.algoritma;

public class LoadingBlocks {
    static {
        System.out.println("Inside static");
    }

    {
        System.out.println("Inside init");
    }

    public LoadingBlocks(){
        System.out.println("Inside constructor");
    }
}
