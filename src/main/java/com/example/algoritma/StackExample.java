package com.example.algoritma;

public class StackExample {

    int topOfStack;
    int capactiy;
    int[] stack;


    StackExample(int capactiy){
        this.capactiy=capactiy;
        stack=new int[capactiy];
        topOfStack=-1;

    }
    void push(int element){
        if (topOfStack==capactiy-1){
            System.out.println("overFlow");
        }else {
            topOfStack++;
            stack[topOfStack]=element;
            System.out.println("added...."+element);
        }
    }

    int pop(){

        if (topOfStack<0){
            System.out.println("underflow..");
            return 0;
        }else {
            int element=stack[topOfStack];
            topOfStack--;
            return element;
        }
        }

}
