package com.example.algoritma.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        try {
            System.out.println("hello ı am here");
            int a = 1;
            if (a == 1) {
                throw new IllegalAccessException("inside trhows");
            }
            int pares = Integer.parseInt("1");
            System.out.println(pares);
        } catch (Exception e) {
            System.out.println("hello not can be it");
            System.out.println(e.getMessage());
        }
        System.out.println("last one");
        List<Person> people = getPeople();

        // Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        // females.forEach(System.out::println);

        // Declarative approach

        // Filter

        List<Person> females2 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());

        // Sort
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        //sortedList.forEach(System.out::println);

    }

    private static List<Person> getPeople() {
        return Arrays.asList(
                new Person("JAmes Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Alex Boz", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
