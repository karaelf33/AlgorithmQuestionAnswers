package com.example.algoritma;

import java.util.Arrays;
import java.util.Collections;

public class GenericTypes {

    public static class Print<T> {
        T print;

        public Print(T print) {
            this.print = print;
        }
    }

    public static void main(String[] args) {
        Print<String> genericTypes = new Print<>("ahnet");
        Print<Integer> integerPrint = new Print<>(2);
        int[] arrays=new int[10];
        String name="Yusuf";
        String name2="Yusuf";
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
        name="bestas";
        System.out.println(name);
/*
        System.out.println(genericTypes.print);
        System.out.println(integerPrint.print);*/
    }

}
