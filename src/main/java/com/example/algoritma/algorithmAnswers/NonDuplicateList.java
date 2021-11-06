package com.example.algoritma.algorithmAnswers;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NonDuplicateList {

    public static int nonDuplicate() {

        Set<Integer> nonDuplicateList = new HashSet<>();
        int count = 0;
        int cRandom = fillList(nonDuplicateList, count);

        System.out.println(nonDuplicateList);
        return cRandom;

    }

    public static int fillList(Set<Integer> set, int count) {
        set.add(randomNumber());
        count++;

        return set.size() == 9 ? count : fillList(set, count);

    }

    public static int randomNumber() {
        int max = 9;
        int min = 1;
        Random randomNum = new Random();
        return min + randomNum.nextInt(max);
    }

    public static void main(String[] args) {
        System.out.println("Random fonksiyonu " + nonDuplicate() + " kere çalışmıştır.");
    }
}
