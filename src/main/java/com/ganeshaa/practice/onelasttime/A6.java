package com.ganeshaa.practice.onelasttime;

import java.util.HashMap;
import java.util.Map;

public class A6 {//frequency

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,2,9,3,7,6,2,3,2,7,2,7,9};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length-1; i++){
            int count = 1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            map.putIfAbsent(arr[i], count);
        }

        for (Map.Entry<Integer, Integer> m :map.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
