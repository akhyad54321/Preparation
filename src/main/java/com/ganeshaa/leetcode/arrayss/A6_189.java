package com.ganeshaa.leetcode.arrayss;

import java.util.Arrays;

public class A6_189 {
    public static void main(String[] args) {
        A6_189 test = new A6_189();
        test.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public void rotate(int[] nums, int k) {
//        int[] temp = new int[nums.length];
//        int[] rev = new int[nums.length];
//        int target = 0;
//        int point = 0;
//
//        for (int a=nums.length-1; a>=0; a--){
//            rev[point] = nums[a];
//            point++;
//        }
//
//        for (int i=k; i<rev.length; i++){
//            temp[target] = rev[i];
//            target++;
//        }
//        for (int j=0; j<k; j++){
//            temp[target] = rev[j];
//            target++;
//        }
//        for (int l=0; l<temp.length; l++) {
//            nums[l] = temp[l];
//        }
//
//        System.out.println("value = " + Arrays.toString(nums));
    }

}
