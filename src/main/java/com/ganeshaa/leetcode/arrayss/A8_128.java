package com.ganeshaa.leetcode.arrayss;

import java.util.Arrays;

public class A8_128 { //remaining hai ye wala qns
    public static void main(String[] args) {
        A8_128 app = new A8_128();
        int count = app.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        System.out.println("count = " + count);
    }
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        if (nums[0] == nums[1]){
            int k = nums[1];
            for (int i=1; i<nums.length; i++){
                if (nums[i] == k){
                    count++;
                }
                k++;
            }
        }else{
            int k = nums[0];
            for (int i=0; i<nums.length; i++){
                if (nums[i] == k){
                    count++;
                }
                k++;
            }
        }
        return count;
    }
}
