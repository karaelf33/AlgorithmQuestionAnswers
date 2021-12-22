package com.example.algoritma;

public class StringCompress {

    public static String compress( String text ) {
        char[] chars = text.toCharArray();
        char current = text.length() > 0 ? chars[0] : ' ';
        char previous = ' ';
        char space = ' ';
        int count = 1;
        StringBuilder finalString = new StringBuilder();

        if (text.length() > 0)
            for (int i = 1; i < chars.length; i++) {
                if (current == chars[i]) {
                    count++;
                } else {
                    finalString.append(current).append(count);
                    if (current==' '){
                        finalString.deleteCharAt(finalString.length()-1);
                    }
                    previous = current;
                    current = chars[i];
                    count = 1;
                }
            }

        if (text.length() > 0 && previous != current)
            finalString.append(current).append(count);
        if (current==' '){
            finalString.deleteCharAt(finalString.length()-1);
        }
        return finalString.toString();
    }


    public static void main(String[] args) {
        System.out.println(compress("a  b  "));
        String str = "aaabbbbccccca";

    }
}
