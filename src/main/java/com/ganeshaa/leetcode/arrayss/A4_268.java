package com.ganeshaa.leetcode.arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4_268 {
    public static void main(String[] args) {
        A4_268 test = new A4_268();
        int missingNumber = test.missingNumber1(new int[]{3,0,1});
        System.out.println("missingNumber = " + missingNumber);
    }

    public int missingNumber1(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int num =0;
        System.out.println("list = " + list);
        for (int i=0; i<=nums.length; i++){
            if (!list.contains(i)){
                num = i;
            }
        }
        return num;
    }
    public int missingNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int num =0;
        for (int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        for (int i=0; i<=nums.length; i++){
            if (!list.contains(i)){
                num = i;
            }
        }
        return num;
    }
}
