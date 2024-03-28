package com.dsaAman;

import java.util.Arrays;

public class Verstappen {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int[] newArr = sortColors(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, high, mid);
                high--;
            }
        }
        return nums;
    }
    public static void swap(int[] a, int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
