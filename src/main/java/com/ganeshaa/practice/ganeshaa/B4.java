package com.ganeshaa.practice.ganeshaa;

import java.util.Arrays;

public class B4 {// reverse the array
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,9,13,19,23,28,7,10,24,26};

        int start = 0; int end = arr.length-1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
