package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TournamentWinner {


    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> scores = new HashMap<>();
        String team, winner = "";

        for (int i = 0; i < competitions.size(); i++) {
            team = competitions.get(i).get(results.get(i) == 0 ? 1 : 0);
            scores.put(team, scores.getOrDefault(team, 0) + 3);
            winner = scores.get(team) > scores.getOrDefault(winner, 0) ? team : winner;
        }

        return winner;
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

        System.out.println(tournamentWinner(arrayLists, aResult));

    }
}
