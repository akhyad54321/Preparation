package com.ganeshaa.practice.servosys;

import java.util.HashSet;
import java.util.Set;

public class Code2b {  //Remove Duplicate element from Array
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 3, 4, 2, 5, 7, 4};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i=0; i<arr.length; i++){
//            set.add(arr[i]);
//
            if (!set.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }

        System.out.println("set = " + set);
        System.out.println("duplicates = " + duplicates);
    }
}
