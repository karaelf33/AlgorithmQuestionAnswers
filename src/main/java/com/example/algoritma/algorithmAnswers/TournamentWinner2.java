package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner2 {

    public static int HOME_TEAM_WON = 1;

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> result) {
        String currentBestTeam = "";
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put(currentBestTeam, 0);

        for (int idx = 0; idx < competitions.size(); idx++) {
            ArrayList<String> competition = competitions.get(idx);
            int result1 = result.get(idx);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String winningTeam = (result1 == HOME_TEAM_WON) ? homeTeam : awayTeam;
            updateScores(winningTeam, 3, scores);
            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }

        }
        System.out.println(currentBestTeam);
        return currentBestTeam;
    }

    public static void updateScores(String team, int points, HashMap<String, Integer> scores) {
        if (!scores.containsKey(team)) {
            scores.put(team, 0);
        }
        scores.put(team, scores.get(team) + points);
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
