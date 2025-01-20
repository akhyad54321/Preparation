package com.ganeshaa.practice.ganeshaa;

public class B1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,9,13,19,23,28,7,10,24,26};
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min=arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
