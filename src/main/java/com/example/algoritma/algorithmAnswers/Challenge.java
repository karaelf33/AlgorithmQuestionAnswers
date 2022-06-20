package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    //second=silent
    //listen
    public static boolean anagram(String first, String second) {
        int count = 0;
        for (int i = 0; i < second.length(); i++) {
            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) == second.charAt(i)) {
                    count++;
                }
            }

        }
        return count == second.length();
    }

    public static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    // Program to square the list of numbers and then filter out the numbers greater than 100 and then find the average of the remaining numbers
    public static void main(String[] args) {
        Student student = new Student(1, "t");
        Student student2 = new Student(2, "ta");
        Student student3 = new Student(3, "tf");
        Student student4 = new Student(33, "fdstf");
        Student student5 = new Student(43, "tdfff");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Integer> list=new ArrayList<>();
        // studentList.stream().filter(i->i.id>20).map(Student::getName).forEach(System.out::println);

        //   System.out.println(anagram("silentt","listen"));
    }
}
