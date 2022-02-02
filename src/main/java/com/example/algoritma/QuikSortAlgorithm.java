package com.example.algoritma;

public class QuikSortAlgorithm {


    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;
        if (arr[leftPointer] < pivot) {
            leftPointer++;
        } else if (arr[leftPointer] > pivot) {
            if (arr[rightPointer]<pivot){
                if (arr[leftPointer] > arr[rightPointer]) {
                    int temp = arr[leftPointer];
                    arr[leftPointer] = arr[rightPointer];
                    arr[rightPointer] = temp;
                    leftPointer++;
                }
            }

        }

        for (int i = 0; i < highIndex - 1; i++) {
            if (arr[i] < pivot) {

            } else if (arr[i] > pivot) {

            }
        }


    }

}
