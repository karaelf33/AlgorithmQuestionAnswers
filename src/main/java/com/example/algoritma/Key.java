package com.example.algoritma;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Key {

    public  static void main(String[] args){

        class Listem{
            String abc="(){}[]";

            public String getAbc() {
                return abc;
            }

            public void setAbc(String abc) {
                this.abc = abc;
            }


        }

        Map<String,String> charMap=new HashMap<String, String>();
        charMap.put("(",")");
        charMap.put("{","}");
        charMap.put("[","]");
        System.out.println(charMap);


        for (Map.Entry<String,String> pairs:charMap.entrySet()){
            System.out.println(pairs);
        }
        Listem listem=new Listem();
        // toCharArray öğren
//        System.out.println(listem.toCharArray());
       }


}
