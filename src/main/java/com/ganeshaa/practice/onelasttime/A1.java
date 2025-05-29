package com.ganeshaa.practice.onelasttime;

public class A1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8,15,78,45,96,28};
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
