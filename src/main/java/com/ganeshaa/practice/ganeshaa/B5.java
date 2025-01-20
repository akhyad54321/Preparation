package com.ganeshaa.practice.ganeshaa;

public class B5 {//Sort first half in ascending order and second half in descending
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,9,13,19,23,28,7,10,24};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<arr.length/2; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i=arr.length-1; i>= arr.length/2; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
