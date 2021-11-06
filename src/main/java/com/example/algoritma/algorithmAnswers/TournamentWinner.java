package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TournamentWinner {


    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> result) {
        Map<String, Integer> scoreTable = new HashMap<>();

        for (ArrayList<String> competition : competitions) {
            for (String s : competition) {
                scoreTable.put(s, 0);
            }
        }
        for (int a = 0; a < result.size(); a++) {
            String homeTeam = competitions.get(a).get(0);
            String awayTeam = competitions.get(a).get(1);
            Integer newScores = (result.get(a) == 0) ? scoreTable.put(awayTeam, scoreTable.get(awayTeam) + 3) : scoreTable.put(homeTeam, scoreTable.get(homeTeam) + 3);
        }
        return maxUsingStreamAndLambda(scoreTable);
    }

    public static <String, V extends Comparable<V>> String maxUsingStreamAndLambda(Map<String, V> map) {
        Optional<Map.Entry<String, V>> maxEntry = map.entrySet()
                .stream()
                .max((Map.Entry<String, V> e1, Map.Entry<String, V> e2) -> e1.getValue()
                        .compareTo(e2.getValue())
                );
        return maxEntry.get().getKey();
    }


    public static void main(String[] args) {
        int n = 3;
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<ArrayList<String>>(n);
        ArrayList<Integer> aResult = new ArrayList<>();
        aResult.add(0);
        aResult.add(0);
        aResult.add(1);
// 0 deplasyman yener 1 ev sahibi yener
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
        a1.add("HTML");
        a1.add("C#");
        arrayLists.add(a1);
        a2.add("C#");
        a2.add("Python");
        arrayLists.add(a2);
        a3.add("Python");
        a3.add("HTML");
        arrayLists.add(a3);
        for (ArrayList<String> arrayList : arrayLists) {
            for (String s : arrayList) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        tournamentWinner(arrayLists, aResult);

    }
}
