package com.example.algoritma.dynamicProgramming;

public class LongestCommonSubSequence {

    // recursive Solution

    public  static int lcsWithRS(String p,String q){


        return lcsWithRSFind(p,q,p.length(),q.length(),1);
    }

    public static int lcsWithRSFind(String p, String q, int n, int m, int result){
        if (n==0 || m==0){
            result=0;
        }else if (p.charAt(n-1)==q.charAt(m-1)){
            result=1+ lcsWithRSFind(p,q,n-1,m-1,result);
        }else if (p.charAt(n-1)>=q.charAt(m-1)){
            int tem1= lcsWithRSFind(p,q,n-1,m,result);
            int tem2= lcsWithRSFind(p,q,n,m-1,result);
            result=Math.max(tem1,tem2);
        }
        return result;
    }



    // Memorize Intermediate Results

    public  static String lcsWithMiR(String p,String q){

        return "";
    }

    // Bottom-up approach

    public  static String lcsWithBuA(String p,String q){

        return "";
    }

    public static void main(String[] args) {
        System.out.println(lcsWithRS("ABCFKKKKK","ABDCFRRRRRRRR"));
    }
}
