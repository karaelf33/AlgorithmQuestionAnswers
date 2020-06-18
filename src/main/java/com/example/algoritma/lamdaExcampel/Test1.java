package com.example.algoritma.lamdaExcampel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        Merhaba merhaba =(mesaj) -> {
            return "Merhaba dünya" +mesaj;
        };
        System.out.println(merhaba.soyle("Burak"));

        List list = Arrays.asList("a", "b", "c", "d", "f");
        System.out.println(list);
        list.stream().forEach();

        Arrays.asList("yusuf", "beştaş", "14").stream().forEach(System.out::println);

        List result=list.stream().sorted((o1, o2) -> o1.getItem().c))

        List result = list.stream().sorted((o1, o2)->o1.getItem().getValue(). compareTo(o2.getItem().getValue())). collect(Collectors.toList());

        List<Personel> personel = null;
        personel.add("Ahmet");


        String staryWithExample = "Bu bir startwith denemesidir";
        Boolean statu;
        statu = staryWithExample.startsWith("Bu");
        System.out.println(statu);
        statu = staryWithExample.endsWith("tir");
        System.out.println(statu);

        List<String> derler = Arrays.asList("burak", "kutbay", "yusuf", "java");
        List<String> result = derler.stream()
                .filter(degerler -> !"java".equals(degerler))
                .collect(Collectors.toList());
        result.stream().forEach(System.out::print);

        List<String> personel = Arrays.asList("Yusuf", "Burak", "Kutya", "B1", "test");

        List<String> secilenPersonel = personel.stream()
                .map(Personel::getAd)
                .filter(ad -> ((String) ad).startsWith("B"))
                .limit(5)
                .collect(Collectors.toList());

        Tech tech = new Tech() {
            @Override
            public void name(String name) {
                System.out.println("hello=" + name);
            }
        };
        tech.name("avc");

        Tech tech1=name -> System.out.println("heee"+name);
        tech1.name("ytyt");


        double result = execute( double first, double second, new Calculate() {
            @Override
            public double execute(double first, double second) {
                return first + second;
            }
        });

        private static double execute ( double first, double second, Calculate calculate){
            return calculate.execute(first + second);
        }
    }

    public interface Calculate {
        double execute(double first, double second);
    }
}
}
