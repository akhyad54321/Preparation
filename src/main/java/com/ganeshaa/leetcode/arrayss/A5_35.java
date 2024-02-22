package com.ganeshaa.leetcode.arrayss;

import java.util.Arrays;
import java.util.List;

public class A5_35 {
    public static void main(String[] args) {
        A5_35 test = new A5_35();
        int insertPosition = test.searchInsert(new int[]{1, 3, 5, 6}, 7);
        System.out.println("insertPosition = " + insertPosition);
    }

    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == target)
                return i;
            else if(nums[i] >target){
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsert1(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int position = 0;
        boolean value = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                position = i;
                value = true;
                break;
            }
            if (list.get(i) > target) {
                position = i;
                value = true;
                break;
            }
        }
        if (!value){
            position = list.size();
        }
        return position;
    }


}
