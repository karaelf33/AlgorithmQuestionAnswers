package com.example.algoritma;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> reminder=new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
          if (!reminder.containsKey(nums[i])){
              reminder.put(target-nums[i],i);
          }else {
              result[0]=reminder.get(target-nums[i]);
              result[1]=i;
              break;
          }
        }



        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }
}
