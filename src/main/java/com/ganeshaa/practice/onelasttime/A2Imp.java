package com.ganeshaa.practice.onelasttime;

import java.util.Arrays;

public class A2Imp {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,8,6,12,15,19,29,39,24,36};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
}
