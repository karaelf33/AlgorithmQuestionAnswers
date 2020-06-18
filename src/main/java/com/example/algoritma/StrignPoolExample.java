package com.example.algoritma;

public class StrignPoolExample {
    public static void main(String[] args) {
        String name1="Yusuf";
        String name2="Yusuf";
        String name3=new String("Yusuf");
        String name4=new String("Yusuf");

        System.out.println(name1.intern());
        System.out.println(name1);
        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name3==name4);

    }
}
