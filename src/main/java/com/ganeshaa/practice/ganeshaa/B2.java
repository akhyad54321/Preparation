package com.ganeshaa.practice.ganeshaa;

import java.util.Arrays;

public class B2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,9,13,19,23,28,7,10,24,26};

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
