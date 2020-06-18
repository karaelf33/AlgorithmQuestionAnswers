package com.example.algoritma.questionies;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String word=scanner.next();
        System.out.println(word);
        System.out.println(word.length());
        for (int i=0;i<=word.length();i++){
            System.out.println(word.substring(0,i));
        }
    }
}
