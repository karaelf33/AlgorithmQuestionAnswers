package com.example.algoritma;

import java.util.*;

public class FrequencyWordList {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad. World is not Coder Pad");
        strings.add("This pad is running Java. There is no world without running pad");
        strings.add("Helo Helo, I will need to close now.");
        strings.add("Yusuf Yusuf Yusuf Yusuf Bestas Bestas Bestas Bestas Bestas Bestas Bestas Bestas");


        System.out.println(topKFrequent(strings, 5));
    }


    public static List<String> topKFrequent(List<String> input, int topMost) {
        HashMap<String, Integer> worldsTimes = new HashMap<>();
        List<String> frequencyList = new ArrayList<>();
        List<String> wordList = new ArrayList<>();
        for (String value : input) {
            String[] arr = value.split(" ");
            wordList.addAll(Arrays.asList(arr));

        }
        for (String s : wordList) {
            if (worldsTimes.containsKey(s)) {
                int point = worldsTimes.get(s) + 1;
                worldsTimes.put(s, ++point);
            } else {
                worldsTimes.put(s, 1);
            }
        }

        return topMost(worldsTimes, frequencyList, topMost);
    }

    public static List<String> topMost(HashMap<String, Integer> map, List<String> topList, int k) {
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Integer value = 0;
        String key = "";
        for (Map.Entry<String, Integer> s : set) {
            if (s.getValue() > value) {
                value = s.getValue();
                key = s.getKey();
            }
        }
        topList.add(key);
        map.remove(key);
        k--;

        return k < 1 ? topList : topMost(map, topList, k);
    }
}
