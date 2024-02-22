package com.ganeshaa.practice.arrays;

import java.util.Arrays;

public class ChangeArrays {
    public static void main(String[] args) {
        int [] arr = {2,4,5,34};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int [] nums){
        nums[0]=39;
        nums[1]=67;
    }
}
