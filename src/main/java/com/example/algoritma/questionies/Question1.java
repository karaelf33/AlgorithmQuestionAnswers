package com.example.algoritma.questionies;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("50 tane sayi gir");
        int gather = 0;
        double average = 0;
        int sequence[] = new int[50];
        int numberies=0;

        for (int i = 0; i < sequence.length; i++) {

            numberies=scanner.nextInt();
            sequence[i]=numberies;
            gather=gather+sequence[i];
            average=gather/sequence.length;

        }
        for (int y=0;y<sequence.length;y++){
            System.out.println(sequence[y]);
        }
        System.out.println(gather);
        System.out.println(average);


    }
}
