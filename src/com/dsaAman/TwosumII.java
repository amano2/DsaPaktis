package com.dsaAman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwosumII {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] indi = twoSumii(arr, target);
        System.out.println(Arrays.toString(indi));
    }

    public static int[] twoSumii(int[] nums, int target) {
        Map<Integer, Integer> var = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (var.containsKey(diff)) {
                return new int[]{var.get(diff)+1, i+1};
            }

            var.put(num,i);
        }
        return new int[]{0,0};
    }
}
