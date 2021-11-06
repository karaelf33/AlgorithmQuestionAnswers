package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {


    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade % 5 > 2 && grade >= 38) {
                result.add(grade + (5 - grade % 5));
            } else {
                result.add(grade);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> grandStudents = new ArrayList<>();
        grandStudents.add(73);
        grandStudents.add(67);
        grandStudents.add(38);
        grandStudents.add(33);
        grandStudents.add(70);
        for (int i = 0; i < gradingStudents(grandStudents).size(); i++) {
            System.out.println(gradingStudents(grandStudents).get(i));
        }


    }
}
