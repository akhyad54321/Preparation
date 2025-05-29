package com.ganeshaa.practice.onelasttime;

import java.util.HashSet;
import java.util.Set;

public class A8 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,2,9,3,7,6,2,3,2,7,2,7,9,10,77,80};
        Set<Integer> set = new HashSet<>();
        Set<Integer> nonrepeating = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            if (!set.add(arr[i])){
                nonrepeating.add(arr[i]);
            }
        }
        System.out.println("1 = " + set);
        System.out.println(nonrepeating);
    }
}
