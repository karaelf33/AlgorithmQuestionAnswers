package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int seqIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (seqIndex == sequence.size()) {
                break;
            }
            if (array.get(i).equals(sequence.get(seqIndex))) {
                seqIndex++;
            }
        }
        return seqIndex == sequence.size();

    }
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> sequence = new ArrayList<>();
        isValidSubsequence(array, sequence);
    }
}
