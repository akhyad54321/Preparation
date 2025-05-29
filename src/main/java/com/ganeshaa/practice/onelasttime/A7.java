package com.ganeshaa.practice.onelasttime;

import java.util.HashSet;
import java.util.Set;

public class A7 {//remove duplicate

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,2,9,3,7,6,2,3,2,7,2,7,9};
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length-1; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
