package com.example.algoritma.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

    public static void main(String[] args){
        List<Staff> staff= Arrays.asList(
                new Staff("test",12,new BigDecimal(123123)),
                new Staff("test2",13,new BigDecimal(123132)),
                new Staff("test3",43,new BigDecimal(32131))
        );
//        List<StaffPublic> result=converToStaffPublic(staff);
    }

//    private static List<StaffPublic> converToStaffPublic(List<Staff> staff) {
//        List<StaffPublic> result=new ArrayList<>();
//        for (Staff temp:staff){
//            StaffPublic
//        }
//    }
}
