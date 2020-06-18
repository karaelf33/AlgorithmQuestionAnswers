package com.example.algoritma.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StackRun {

    private static final Map<Character,Character> matching=new HashMap<>();
    private static final Set<Character> openingPArentSEt=new HashSet<>();

    static {
        matching.put(')','(');
        matching.put(']','[');
        matching.put('}','{');

        openingPArentSEt.addAll(matching.values());
    }

    public static void main(String[] args){
        System.out.println(openingPArentSEt);
    }
}
