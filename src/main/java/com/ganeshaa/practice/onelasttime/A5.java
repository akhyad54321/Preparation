package com.ganeshaa.practice.onelasttime;

import java.util.Arrays;

public class A5 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,8,6,25,12,15,19,29,39,24,36};

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i=0; i<arr.length/2-1; i++){
            System.out.print( arr[i] + " ");
        }
        for (int i=arr.length-1; i>arr.length/2; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
