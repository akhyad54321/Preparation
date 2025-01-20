package com.ganeshaa.practice.ganeshaa;

import java.util.HashSet;

public class B8 {//Finding Non Repeating elements in an Array
    public static void main(String[] args) {
        int[] arr= new int[]{2,3,5,7,2,5,9,2,5,7,2,5};
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println("set = " + set);
    }
}
