package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public static boolean hasPairWithSum(List<Integer> data,int sum){

        int low=0;
        int hi=data.size()-1;

        while (low<hi){
            int s=data.get(low)+data.get(hi);
            if (s==sum) return true;
            if (s>sum) hi--;
            if (s<sum) low++;

        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(-8);
        a.add(1);
        a.add(2);
        a.add(5);
        a.add(4);
        System.out.println(hasPairWithSum(a,8));
    }
}
