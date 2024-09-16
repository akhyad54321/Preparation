package com.ganeshaa.practice.arrays;

public class SmallestAndLargest {
    public static void main(String[] args) {

        int[] arr = new int[]{2,4,3,65,43,23,5};
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
