package com.example.algoritma;

public class StringBuilderRemoveLastCharacterExample {
    //creates an empty StringBuilder object
    public static void main(String[] args) {
    StringBuilder sbld = new StringBuilder();

    int[] numbers = {1, 2, 3, 4, 5};

        for(int number : numbers){
        sbld.append(number).append(",");
    }

        System.out.println("StringBuilder contains: " + sbld);

    /*
     * To remove last character from StringBuilder, use
     * the deleteCharAt method
     */

    //always make sure to check the length to avoid exception
        System.out.println(sbld.length());
        System.out.println(sbld);
        if( sbld.length() > 0 )
                sbld.deleteCharAt( sbld.length() - 1 );

        System.out.println("StringBuilder contains: " + sbld);
}
}
