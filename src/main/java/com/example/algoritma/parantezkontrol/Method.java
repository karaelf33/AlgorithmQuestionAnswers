package com.example.algoritma.parantezkontrol;

import java.util.*;

public class Method {

    private static final Map<Character,Character> matcingParenMap=new HashMap<>();
    private static final Set<Character> openingParentSet=new HashSet<>();

    static {
        matcingParenMap.put(')','(');
        matcingParenMap.put(']','[');
        matcingParenMap.put('}','{');
    }

    public static boolean hasMatcingParents(String input){
        try{
            Stack<Character> parentStack=new Stack<>();
            for (int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if (openingParentSet.contains(ch)){
                    Character lastParen=parentStack.pop();
                    if (lastParen !=matcingParenMap.get(ch)){
                        return false;
                    }
                }
            }
            return parentStack.isEmpty();
        }catch (StackOverflowError soe){
            System.out.println("Stack Overflow");
    }
    return false;
    }
}
