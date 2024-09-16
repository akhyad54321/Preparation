package com.ganeshaa.practice.arrays;

public class EvenOddNo {
    public static void main(String[] args) {
        int[] arr = new int[]{12,23,26,34,45,12,12,34,12,45};
        int even = 0;
        int odd = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
