package com.ganeshaa.practice.arrays;

import java.util.Arrays;


//Two Pointer Method:
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12, 24, 54, 6, 45, 65, 34, 23};
        System.out.println("ARRAY BEFORE SORT = " + Arrays.toString(arr));

        int end = arr.length - 1;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (i < end) {
                temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
            }
            end--;
        }
        System.out.println("ARRAY AFTER SORT = " + Arrays.toString(arr));

    }
//    public static void main(String[] args) {
//
//        int[] arr = {12,34,54,65,78,90,32,34};
//        System.out.println("ARRAY BEFORE SORT = " + Arrays.toString(arr));
//
//        int start = 0;
//        int end = arr.length-1;
//        int temp;
//        while (start<end){
//            temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        System.out.println("ARRAY AFTER SORT = " + Arrays.toString(arr));
//    }
}
