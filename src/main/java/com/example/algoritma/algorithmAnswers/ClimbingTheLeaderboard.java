package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : ranked) {
            if (!map.containsKey(integer))
                map.put(integer, rank++);
        }
        int initial = ranked.size() - 1;
        for (int score : player) {
            for (int i = initial; i >= 0; i--) {
                if (score >= ranked.get(i)) {
                    rank = map.get(ranked.get(i));
                    initial = i - 1;
                } else {
                    break;
                }
            }
            result.add(rank);
        }
        return result;
    }


    public static void main(String[] args) {

        List<Integer> ranked = new ArrayList<Integer>() {
            {
                add(100);
                add(90);
                add(90);
                add(80);
                add(75);
                add(60);
            }
        };
        List<Integer> player = new ArrayList<Integer>() {
            {
                add(50);
                add(65);
                add(77);
                add(90);
                add(102);
            }
        };
        for (int i = 0; i < climbingLeaderboard(ranked, player).size(); i++) {

            System.out.println(climbingLeaderboard(ranked, player).get(i));
        }
        ;

    }
}
    /*int dereceli[n] : skor tablosu puanları
        int player[m] : oyuncunun puanları*/