package com.example.algoritma.parantezkontrol;

import java.util.Arrays;

public class InterviewQuestion {

    static int[] ma(int[] v,int n,int w){
        int[] result=new int[n-w+1];
        for(int i=0;i<=n-w;i++){
            int total=0;
            for(int j=0;j<w;j++){
                total+=v[j+i];
            }
            result[i] =total/w;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] v ={12, 15, 21, 30, 24, 42};
        System.out.println(Arrays.toString(ma(v, 6, 3)));
    }


 /*   int [] ma(int[] v,int n,int w){
        int[] result=new int[X];
        for(int i=0;i<=n-w;i++){
            int total=0;
            for(int j=0;j<w;j++){
                total+=v[j+i];
            }
            result[i] =total/w;
        }
        return result;
    }

    w=1 ⇒a
            w=n ⇒


    Input

    v=[1,2,2,3,2,4]
    n=6
    w=3 1<=w<=n

            w = 1 ⇒
    w = n ⇒

    w=3


    Step 0 v=[1,2,2,3,2,4] ⇒ mav[0]=(1+2+2)/3
    Step 1 v=[1,2,2,3,2,4] ⇒ mav[1]=(2+2+3)/3
            ...
    Step 3 v=[1,2,2,3,2,4] ⇒ mav[3]=(3+2+4)/3

    Output

    mav=[5/3,7/3,7/3,9/3]*/
}
