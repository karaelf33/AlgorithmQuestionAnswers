package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixLayerRotation {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        // Write your code here

       // System.out.println(matrix.get(0).get(0));
       // System.out.println(matrix.get(1).get(0));

        // matrixn genişliği bir azalt o uzunluk kadar  2. paramteri bir artır
        // sonra matrizin derinliği

        for (int i=0;i<matrix.get(1).size();i++){

        }

        System.out.println(matrix.get(3).get(0));
        List<List<Integer>> newMatrix=new ArrayList<>();
/*
        1 2 3 4
        7 8 9 10
        13 14 15 16
        19 20 21 22
        25 26 27 28
        */

        System.out.println(matrix.get(3).get(1));
        for (List<Integer> list:matrix){
            List<Integer> horizontal=new ArrayList<>();
            for (int i=0;i<list.size();i++){
              //  horizontal.add();
            }
            newMatrix.add(horizontal);

        }

        for (List<Integer> list : matrix) {
            for (Integer s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
        for (List<Integer> list : newMatrix) {
            for (Integer s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        //matrix make flat

        System.out.println("flattt");
        System.out.println(transform(matrix));

    }

    public static void matrixRotation2(List<List<Integer>> matrix, int r) {

        // sola döndür

        // aşağı döndür



        // sağa döndür

        // yukar dönür

    }
    public static List<Integer> transform(List<List<Integer>> matrix){
        return matrix.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        List<List<Integer>> vertical = new ArrayList<>();
        List<Integer> horizontal1 = new ArrayList<>();
        List<Integer> horizontal2 = new ArrayList<>();
        List<Integer> horizontal3 = new ArrayList<>();
        List<Integer> horizontal4 = new ArrayList<>();
        List<Integer> horizontal5 = new ArrayList<>();

        horizontal1.add(1);
        horizontal1.add(2);
        horizontal1.add(3);
        horizontal1.add(4);
        vertical.add(horizontal1);

        horizontal2.add(7);
        horizontal2.add(8);
        horizontal2.add(9);
        horizontal2.add(10);
        vertical.add(horizontal2);

        horizontal3.add(13);
        horizontal3.add(14);
        horizontal3.add(15);
        horizontal3.add(16);
        vertical.add(horizontal3);

        horizontal4.add(19);
        horizontal4.add(20);
        horizontal4.add(21);
        horizontal4.add(22);
        vertical.add(horizontal4);

        horizontal5.add(25);
        horizontal5.add(26);
        horizontal5.add(27);
        horizontal5.add(28);
        vertical.add(horizontal5);
        matrixRotation(vertical,1);
      /*  for (List<Integer> list : vertical) {
            for (Integer s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }*/
    }
}

