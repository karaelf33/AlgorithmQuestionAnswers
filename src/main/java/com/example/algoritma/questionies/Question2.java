package com.example.algoritma.questionies;

public class Question2 {
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (i==j){
                    System.out.print("1");
                }
                else if (i<j){
                    System.out.print("2");
                }else if (i>j){
                    System.out.print("0");
                }
            }
                System.out.println(" ");
        }
    }
}
