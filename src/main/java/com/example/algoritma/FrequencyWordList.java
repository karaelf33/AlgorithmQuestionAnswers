package com.example.algoritma;

import java.util.*;

public class FrequencyWordList {

    static class User{
        String name;

        public User(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {


       /* ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad. World is not Coder Pad");
        strings.add("This pad is running Java. There is no world without running pad");
        strings.add("Helo Helo, I will need to close now.");
        strings.add("Yusuf Yusuf Yusuf Yusuf Bestas Bestas Bestas Bestas Bestas Bestas Bestas Bestas");


        System.out.println(topKFrequent(strings, 5));*/
    }

    public List<String> topKFrequent(String[] words,int k){
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++)
            map.put(words[i],map.getOrDefault(words[i],0)+1);


        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(map.size(),
                (a,b) -> {
                    if(Objects.equals(a.getValue(), b.getValue()))
                        return a.getKey().compareTo(b.getKey());
                    return b.getValue() - a.getValue();
                });

        for(Map.Entry mv : map.entrySet())
            pq.add(mv);

        List<String> ls = new ArrayList<>();
        for(int i=0;i<k;i++){
            ls.add(pq.poll().getKey());
        }
        return ls;
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

        if (k<1){
            System.out.println(topList);
            Collections.sort(topList);
            return topList;
        }else{
            return topMost(map, topList, k);
        }
    }
}
