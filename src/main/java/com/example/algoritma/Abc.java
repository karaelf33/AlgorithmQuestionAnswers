package com.example.algoritma;

import java.util.List;

public class Abc {
    private static String parseGuid(List<String> guidList){
        StringBuilder result=new StringBuilder();
        for (String s:guidList){
            result.append(s).append(";");
        }
        if (result.length()>0){
            result.toString().substring(0,result.length()-1);
        }
        return result.toString();
    }
}
