package com.example.algoritma;

import java.util.Scanner;

public class Trigon {
    static {
        System.out.println("Inside static");
    }

    {
        System.out.println("Inside init");
    }

    public Trigon(){
        System.out.println("Inside constructor");
    }

    public static void main(String args[]){
        new Trigon();
    }

}
