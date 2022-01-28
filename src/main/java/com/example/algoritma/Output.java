package com.example.algoritma;

public class Output {

    private static void uncheckedException() throws Error {
        try {
            int result=2/0;
            System.out.println(result);
            return;

        } catch (ArithmeticException e) {
            System.out.println("Catch Exception" + e.getLocalizedMessage());
            throw e;
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        uncheckedException();
    }
}
