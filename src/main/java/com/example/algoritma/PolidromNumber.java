package com.example.algoritma;

import java.util.Scanner;

public class PolidromNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");

        int polidrom = scanner.nextInt();
        int t = polidrom;
        int lenght = String.valueOf(polidrom).length();

        int kalan, y = 0;
        int x = 0;
        for (int i = 0; i < lenght; i++) {
            kalan = polidrom % 10;
            x = x * 10 + kalan;
            polidrom = polidrom / 10;
        }
        if (x == t) {
            System.out.println("polidrom sayi" + x);
        } else {
            System.out.println("polidrom sayi değil" + x);
        }
    }
}
