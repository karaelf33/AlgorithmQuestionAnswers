package com.example.algoritma.algorithmAnswers;

public class SortedSquaredArray {
    public static int[] sortedSquaredArray(int[] array) {

        int[] sqrArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sqrArray[i] = array[i] * array[i];
        }

        return sortedArray(sqrArray);
    }

    public static int[] sortedArray(int[] arrayToSort) {
        boolean isSorted = true;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                int tempt = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i + 1];
                arrayToSort[i + 1] = tempt;
                isSorted = false;
            }
        }
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i]);
        }
        return isSorted ? arrayToSort : sortedArray(arrayToSort);
    }


    public static void main(String[] args) {
        int[] array = {-9, 1, 2, 3, 4, 5, 6, 7, 8,};
        sortedSquaredArray(array);
    }
}
