package com.example.algoritma.algorithmAnswers;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringDepthSolution {

    public static String getDashFromInt(Integer depth) {

        StringBuilder dash = new StringBuilder();

        for (int i = 0; i < depth * 2; i++) {

            dash.append("-");

        }

        return dash.toString();
    }

    private static void calculateDepth(String text) {
        Stack<Character> textStack = new Stack<>();
        HashMap<Character, Integer> charAndDepth = new HashMap<>();

        int depth = 0;

        for (int i = 0; i < text.length(); i++) {

            if (textStack.isEmpty() || !textStack.peek().equals(text.charAt(i))) {
                textStack.add(text.charAt(i));
                depth++;
                charAndDepth.put(text.charAt(i), depth - 1);
            } else {
                textStack.pop();
                depth--;
            }

        }


        writeKeyDashChar(charAndDepth);
    }

    private static void writeKeyDashChar(HashMap<Character, Integer> charAndDepth) {
        for (Map.Entry<Character, Integer> entry : charAndDepth.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(getDashFromInt(value) + key);

        }
    }

    public static void main(String[] args) {

        String text = "abckkcbdelttleda";
        calculateDepth(text);


    }


}