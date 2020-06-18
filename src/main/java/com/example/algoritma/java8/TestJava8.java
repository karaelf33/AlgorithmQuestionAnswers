package com.example.algoritma.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {
    public static void main(String[] args) {

        List<String> aplha = Arrays.asList("a", "b", "c", "d", "e");

        List<String> alphaUpper = new ArrayList<>();
        for (String s : aplha) {
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(alphaUpper);
        System.out.println(aplha);

        List<String> colelct = aplha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(colelct);

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
