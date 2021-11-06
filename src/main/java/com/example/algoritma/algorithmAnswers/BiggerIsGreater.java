package com.example.algoritma.algorithmAnswers;

import java.util.Arrays;

//yusuf beştaş
public class BiggerIsGreater {

    public static String biggerIsGreater(String w) {
        char[] charArr = w.toCharArray();
        int lengthOfCharArr = charArr.length;
        int indexOfCharArr = 0;

        for (indexOfCharArr = lengthOfCharArr - 1; indexOfCharArr > 0; indexOfCharArr--) {
            if (charArr[indexOfCharArr] > charArr[indexOfCharArr - 1]) {
                break;
            }
        }
        if (indexOfCharArr == 0) {
            return "no answer";
        } else {
            int small = charArr[indexOfCharArr - 1], next = indexOfCharArr;
            for (int j = indexOfCharArr + 1; j < lengthOfCharArr; j++) {
                if (charArr[j] > small && charArr[j] < charArr[next]) {
                    next = j;
                }

            }
            swap2(charArr, indexOfCharArr - 1, next);
            Arrays.sort(charArr, indexOfCharArr, lengthOfCharArr);
        }

        return new String(charArr);
    }

    public static void swap2(char[] charArr, int i, int j) {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }


    public static void main(String[] args) {
        biggerIsGreater("imllmmcslslkyoegymoa");
    }
}
