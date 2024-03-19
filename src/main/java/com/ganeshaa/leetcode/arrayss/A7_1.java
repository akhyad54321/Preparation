package com.ganeshaa.leetcode.arrayss;

import java.util.Arrays;

public class A7_1 {
    public static void main(String[] args) {
        A7_1 app = new A7_1();
        int[] twoSum = app.twoSum(new int[]{2, 7, 11, 15, 6}, 17);
        System.out.println("twoSum = " + Arrays.toString(twoSum));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        boolean value = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                    value = true;
                }
                if (value) {
                    break;
                }
            }
        }

        return arr;
    }
}
