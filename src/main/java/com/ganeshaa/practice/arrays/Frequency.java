package com.ganeshaa.practice.arrays;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = new int[]{12,23,26,34,45,12,12,34,12,45};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            int count = 1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            map.putIfAbsent(arr[i], count);
        }

        System.out.println("==========");
        for (Map.Entry<Integer, Integer> m: map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
