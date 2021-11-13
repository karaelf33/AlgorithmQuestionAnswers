package com.example.algoritma.algorithmAnswers;

import java.util.stream.IntStream;

public class TwoCharactersSolution {

// https://programs.programmingoneonone.com/2021/04/hackerrank-two-characters-solution.html
    public static void main(String[] args) {

        int maxLength = getMaxLength("beabeefeabeekk");
        System.out.println(maxLength);

    }
    static boolean isAlternative(int[] str){
        return str[0]!=str[1] && IntStream.range(2,str.length).allMatch(i->str[i]==str[i%2]);
    }
    private static int getMaxLength(String s) {
        int[] nums= s.chars().distinct().toArray();

        int maxLength=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int a=nums[i]; int b=nums[j];
                int [] removed= s.chars().filter(c->c==a||c==b).toArray();
                if(isAlternative(removed) && removed.length>maxLength)
                    maxLength=removed.length;
            }
        }
        return maxLength;
    }

}
