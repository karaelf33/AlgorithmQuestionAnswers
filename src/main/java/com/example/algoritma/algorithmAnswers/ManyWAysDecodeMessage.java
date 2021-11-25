package com.example.algoritma.algorithmAnswers;

public class ManyWAysDecodeMessage {


    public static int countWayDecodeMessage(String data) {
        return helper(data, data.length());
    }

    public static int helper(String data, int k) {
        if (k == 0  | k==1) {
            System.out.println("test");
            return 1;
        }
        int s = data.length() - k;
        if (data.charAt(s) == '0') {
            System.out.println("zero");
            return 0;
        }
        int result = helper(data, k - 1);
        if (k >= 0 && Integer.parseInt(data.substring(s, s + 2)) <= 26) {
            result += helper(data, k - 2);
        }
        return result;
    }


    public static int fac(int n){
        if (n<1){
            System.out.println("222222222");
            return 1;
        }
        if (n>=1){
            System.out.println("33333333");
            return n*fac(n-1);
        }
        return 1;
    }


    public static void main(String[] args) {
       // System.out.println(countWayDecodeMessage("111111"));
        System.out.println(fac(5));
    }
}
