package com.ganeshaa.practice.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,3,6,4,2,5};
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
