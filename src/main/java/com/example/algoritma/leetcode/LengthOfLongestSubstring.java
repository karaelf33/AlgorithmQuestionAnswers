package com.example.algoritma.leetcode;

import javax.validation.constraints.Max;
import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstringMyWay(String s) {
        int start_pointer = 0;
        int end_pointer = 0;
        int max = 0;

        HashSet<Character> subString = new HashSet<>();

        while (end_pointer < s.length()) {
            if (!subString.contains(s.charAt(end_pointer))) {
                subString.add(s.charAt(end_pointer));
                end_pointer++;
                max = Math.max(subString.size(), max);
            } else {
                subString.remove(s.charAt(start_pointer));
                start_pointer++;
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstringBestWay(String s) {
        Integer[] chars = new Integer[128];
        int left = 0;
        int right = 0;

        int res = 0;

        while (right < s.length()) {
            char r = s.charAt(res);
            Integer index = chars[r];
            if (index != null && index >= left && index < right) {
                left = index + 1;
            }
            res = Math.max(res, right - left + 1);
            chars[r] = right;
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstringBestWay("abcadad");
    }
}
