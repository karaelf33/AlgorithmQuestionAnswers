package com.example.algoritma.casting;

import java.util.HashMap;
import java.util.Map;

public class Casting {

    public static void main(String[] args) {
        Animal animal=new Animal();
        Map<Animal, Integer> phoneBook = new HashMap<>();
        phoneBook.put(animal,43);
        animal.setName("weqe");
        System.out.println(phoneBook);


    }
}
