package com.example.algoritma.algorithmAnswers;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String meridian = s.substring((s.length() - 2), s.length());
        if (meridian.equals("PM") && hour < 12) {
            hour += 12;
        } else if (meridian.equals("AM") && hour == 12) {
            hour = 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hour).append(":");
        if (minutes < 10) {
            stringBuilder.append(0).append(minutes);
        } else {
            stringBuilder.append(minutes);
        }
        stringBuilder.append(":");
        stringBuilder.append(seconds);

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        String s = "06:40:03AM";
        System.out.println(timeConversion(s));
    }
}
