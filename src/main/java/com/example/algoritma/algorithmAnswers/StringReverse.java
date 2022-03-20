package com.example.algoritma.algorithmAnswers;

public class StringReverse {


    public static void main(String[] args) {

        char c=97;
        String name = "gaurav"+c;
        System.out.println(name);
        String reversedString = "";

        for(int i = name.length()-1; i>=0; i--){
            reversedString = reversedString + name.charAt(i);
        }
        if(reversedString.equals(name)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        };

    }
}
