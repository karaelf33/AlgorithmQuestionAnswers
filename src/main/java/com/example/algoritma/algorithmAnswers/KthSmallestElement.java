package com.example.algoritma.algorithmAnswers;

import java.util.Arrays;
import java.util.List;

public class KthSmallestElement {

    public static int[] findKSmallest(int[] arr, int k) {
        int[] result = new int[k];
        int heapSize = arr.length;
        // Write - Your - Code

        for (int i = (heapSize - 1) / 2; i >= 0; i--) {
            minHeap(arr, heapSize, i);
        }

        // extract elements from heap
        for (int i = heapSize - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            minHeap(arr, 0, i);
        }

        for (int j = 0; j < k; j++) {
            result[j] = arr[j];
        }
        return result;
    }
    public static void minHeap(int[] arr, int index, int heapSize) {
        int smallest = index;
        int left = (2 * index) + 1; // 1 more than half the index
        int right = (2 * index) + 2; // 2 more than half the index
        if (left < heapSize && arr[smallest] < arr[left]) {
            smallest = left;
        }
        if (right < heapSize && arr[smallest] < arr[right]) {
            smallest = right;
        }
        if (smallest != index) {
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;
            minHeap(arr, smallest, heapSize);
        }
    }

    public static void main(String[] args) {

    }
}
