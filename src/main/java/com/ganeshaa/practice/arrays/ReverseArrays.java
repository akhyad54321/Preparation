package com.ganeshaa.practice.arrays;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,3,65,43,23,5};

        int temp;
        int end = arr.length-1;

        for (int i=0; i<arr.length; i++){
            if (i<end){
                temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
            }
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
