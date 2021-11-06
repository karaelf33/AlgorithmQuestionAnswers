package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner3 {


    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> result) {


        HashMap<String, Integer> scores = new HashMap<>();
        String currentBestTeam = "";
        scores.put(currentBestTeam, 0);
        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            String HOME_TEAM = competition.get(1);
            String AWAY_TEAM = competition.get(1);
            String WINNER_TEAM = (result.get(i) == 0) ? AWAY_TEAM : HOME_TEAM;
            updateScores(WINNER_TEAM, 3, scores);

            if (scores.get(WINNER_TEAM) > scores.get(currentBestTeam)) {
                currentBestTeam = WINNER_TEAM;
            }
        }

        return currentBestTeam;
    }

    public static void updateScores(String team, int point, HashMap<String, Integer> scores) {
        if (!scores.containsKey(team)) {
            scores.put(team, 0);
        }
        scores.put(team, scores.get(team) + point);

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
