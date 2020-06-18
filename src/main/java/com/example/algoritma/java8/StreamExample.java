package com.example.algoritma.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("U", 30, new BigDecimal(10000)),
                new Staff("U", 27, new BigDecimal(20000)),
                new Staff("U", 33, new BigDecimal(30000))
        );
        Staff staff1=new Staff();
        staff1.setName("ertete");
        staff1.setAge(12121);
        staff1.setSalary(new BigDecimal(12121));
        System.out.println(staff1);
        System.out.println(staff);

        List<String> result=new ArrayList<>();
        for (Staff x:staff){
            System.out.println(x.getName());
        }

        List<String> collect=staff.stream().map(item->item.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
