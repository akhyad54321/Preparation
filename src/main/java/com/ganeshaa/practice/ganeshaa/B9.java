package com.ganeshaa.practice.ganeshaa;

import java.util.HashSet;

public class B9 {////Finding Repeating elements in an Array
    public static void main(String[] args) {
        int[] arr= new int[]{2,3,5,7,2,5,9,2,5,7,2,5};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            if (!set.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }

        System.out.println("Duplicates = " + duplicates);
    }
}
