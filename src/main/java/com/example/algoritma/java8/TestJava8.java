package com.example.algoritma.java8;

import java.util.HashMap;
import java.util.Map;

interface Sub{
    static int callMe() {
        return 1;
    }
}
public class TestJava8  implements Sub{
    static int callMe() {
        return 3;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> h = new HashMap<>();
        h.put(1, 1);
        h.put(3, 2);
        h.put(null, 2);
        h.put(3, 2);
        System.out.println(h);
        TestJava8 testJava8=new TestJava8();
        System.out.println(TestJava8.callMe());
    }
}
