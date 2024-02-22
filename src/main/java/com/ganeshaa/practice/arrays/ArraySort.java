package com.ganeshaa.practice.arrays;

public class ArraySort {
    public static void main(String[] args) {

        int [] arr = {12,43,23,76,26,54,67,41};
        System.out.println("Array before Asc Order");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("---------------------------");
        int temp;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
