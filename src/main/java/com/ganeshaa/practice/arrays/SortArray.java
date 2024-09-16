package com.ganeshaa.practice.arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = new int[]{12,43,23,65,78,65,90};

        int temp;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k=0; k< arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
