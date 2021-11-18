package com.example.algoritma.algorithmAnswers;

import java.util.Scanner;

public class Substring {

    public static String subString(String s,int start,int end){
        return s.substring(start,end);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(subString(S,start,end));
    }
}
