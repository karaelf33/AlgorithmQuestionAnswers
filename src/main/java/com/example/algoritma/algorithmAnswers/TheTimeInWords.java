package com.example.algoritma.algorithmAnswers;

public class TheTimeInWords {


    public static String timeInWords(int h, int m) {
        // Write your code here

        // m<30 use past

        //m>30 us
        convertToWords(String.valueOf(h).toCharArray());
        convertToWords(String.valueOf(m).toCharArray());
        return "";
    }

    public static void convertToWords(char[] num) {
        int len = num.length;

        // Base cases
        if (len == 0) {
            System.out.println("empty string");
            return;
        }
        String[] single_digits = new String[]{
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        String[] two_digits = new String[]{
                "", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };
        String[] tens_multiple = new String[]{
                "", "", "twenty", "thirty", "forty",
                "fifty"};

        if (len == 1) {
            System.out.println(single_digits[num[0] - '0']);
            return;
        }
        if (num[0] - '0' == 2
                && num[1] - '0' == 0) {
            System.out.println("twenty");
            return;
        }
        if (num[0] - '0' == 1) {
            int sum
                    = num[0] - '0' + num[1] - '0';
            System.out.println(two_digits[sum]);
            return;
        }
        int i = (num[0] - '0');
        if (i > 0)
            System.out.print(tens_multiple[i]
                    + " ");
        else
            System.out.print("");
        if (num[0] - '0' != 0)
            System.out.println(single_digits[num[0] - '0']);

    }


    public static void main(String[] args) {
        System.out.println(timeInWords(9, 34));
        //convert_to_words("9923".toCharArray());

    }
}
