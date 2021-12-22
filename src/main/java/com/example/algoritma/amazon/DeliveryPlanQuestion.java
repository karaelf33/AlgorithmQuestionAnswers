package com.example.algoritma.amazon;

import java.util.*;
import java.util.stream.Collectors;

public class DeliveryPlanQuestion {

    public static List<List<Integer>> deliveryPlan(List<List<Integer>> allLocations, int numDeliveries) {
        List<Integer> integerList = transform(allLocations);
        List<Double> square = new ArrayList<>();

        for (int i = 0; i < integerList.size() - 1; i = i + 2) {

            double root = Math.pow(integerList.get(i), 2) + Math.pow(integerList.get(i + 1), 2);
            square.add(root);
        }

       List<Integer> smallest= findKthSmallest(square, numDeliveries);
        List<List<Integer>> vertical = new ArrayList<>();
        for (int i=0;i< smallest.size()-1;i++){
            vertical.add(allLocations.get(smallest.get(i)));
        }


        return vertical;
    }


    public static List<Integer> transform(List<List<Integer>> matrix) {
        return matrix.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static List<Integer> findKthSmallest(List<Double> input, int k) {
        List<Integer> smallestIndex = new ArrayList<>();
        if (input == null || input.size() < k) {
            System.exit(-1);
        }

        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(input.subList(0, k));

        for (int i = k; i < input.size(); i++) {
            if (input.get(i) < pq.peek()) {
                smallestIndex.add(i);
            }
        }


        return smallestIndex;
    }

    public static void main(String[] args) {
        List<List<Integer>> vertical = new ArrayList<>();
        List<Integer> horizontal1 = new ArrayList<>();
        List<Integer> horizontal2 = new ArrayList<>();
        List<Integer> horizontal3 = new ArrayList<>();


        horizontal1.add(1);
        horizontal1.add(2);
        vertical.add(horizontal1);

        horizontal2.add(3);
        horizontal2.add(4);
        vertical.add(horizontal2);

        horizontal3.add(1);
        horizontal3.add(-1);
        vertical.add(horizontal3);
        deliveryPlan(vertical, 2);


    }
}
