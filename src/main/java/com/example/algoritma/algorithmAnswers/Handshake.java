package com.example.algoritma.algorithmAnswers;

public class Handshake {
    public static int handshake(int n) {
        // Write your code here
        if (n == 0 || n == 1) {
            return 0;
        }else if (n==2){
            return 1;
        }
        return n * (n - 1) / 2 - 1;
    }

    static int  fact(int n)
    {
        // wrong base case (it may cause
        // stack overflow).
        if (n == 100)
            return 1;

        else
            return n*fact(n-1);
    }


    public static void main(String[] args) {
        // System.out.println(handshake(4414906));
          fact(10);
    }
}
