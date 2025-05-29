package com.ganeshaa.practice.onelasttime;

import java.util.Arrays;

public class A4Imp {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,8,6,12,15,19,29,39,24,36};
        int start = 0;
        int end = arr.length-1;
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
