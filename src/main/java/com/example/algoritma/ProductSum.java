package com.example.algoritma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductSum {

    // array  = [5, 2, [7, -1],3, [6, [-13, 8], 4]]
    //5+2+(2*6)+3+(2*((3* -5)+4))

    public static void main(String[] args) {
    }
    public static int productSum(List<Object> array){
        return productSum(array,1);
    }
    public static int productSum(List<Object> array,int depth) {
        int sum =0;
       for(Object item:array){
           if (item instanceof ArrayList){
               sum+=(depth+1)*productSum(new ArrayList<>((Collection<?>)item),depth+1);
           }else {
               sum +=(Integer) item;
           }
       }
        return sum;
    }
}
