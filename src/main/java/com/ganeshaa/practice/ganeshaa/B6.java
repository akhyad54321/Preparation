package com.ganeshaa.practice.ganeshaa;

import java.util.HashMap;
import java.util.Map;

public class B6 {//frequency of element using 2 loop:
    public static void main(String[] args) {
        int[] arr= new int[]{2,3,5,7,2,5,9,2,5,7,2,5};

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

        for (Map.Entry<Integer, Integer>m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
