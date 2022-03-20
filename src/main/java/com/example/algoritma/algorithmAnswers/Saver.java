package com.example.algoritma.algorithmAnswers;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@SuppressWarnings("all")
public class Saver {
    public static void calculateAndSaveToDatabase(Map<String, Integer> map,
                                                  String arg0, Object name, Object surname, Object personalId,
                                                  Object department, Object year, Object faculty, Object subject,
                                                  Object filename, Object server) {
        AtomicInteger result = new AtomicInteger(0);
        map.entrySet().stream().filter(a -> {
            if (a.getKey().startsWith("sava")) {
                result.addAndGet(a.getValue());
            }
            return false;
        }).collect(Collectors.toList());
        System.out.println(result.get());

        if (arg0.equals("save to database")) {
            saveToDatabase(result.get(), name, surname, personalId, department, year, faculty, subject);
        }
        if (arg0 == "save to file") {
            saveToFile(result.get(), name, surname, personalId, department, year, faculty, subject, filename);
        }
        if (arg0 == "save on server") {
            saveOnServer(result.get(), name, surname, personalId, department, year, faculty, subject, filename, server);
        }
    }

    private static void saveToDatabase(Integer sumOfIntegerScor, Object name, Object surname, Object personalId, Object year, Object arg4, Object arg5, Object arg6) {
        // save to database
    }

    private static void saveToFile(Integer integer, Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7) {
        // save to file
    }

    private static void saveOnServer(Integer integer, Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8) {
        // save on server
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("sava", 3);
        map.put("savaa", 2);
        map.put("savaaa", 3);
        map.put("savabbb", 5);
        map.put("savwbbb", 3);
        AtomicInteger result = new AtomicInteger();
        map.entrySet().stream().filter(a -> {
            if (a.getKey().startsWith("sava")) {
                result.addAndGet(a.getValue());
            }
            return false;
        }).collect(Collectors.toList());
        System.out.println(result);
    }
}

