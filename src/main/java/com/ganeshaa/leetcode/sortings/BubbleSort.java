package com.ganeshaa.leetcode.sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.music(new int[]{1,2,3,4,5});
    }

   public void music(int[] arr){
        int temp;
        boolean value;
        for (int i=0; i< arr.length; i++){
            value=false;
            for (int j=1; j<arr.length-i; j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    value=true;
                }
            }
            if (value==false){
                break;
            }
        }
       System.out.println(Arrays.toString(arr));
    }
}
