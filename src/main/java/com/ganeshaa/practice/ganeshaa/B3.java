package com.ganeshaa.practice.ganeshaa;

public class B3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,9,13,19,23,28,7,10,24,26};
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
