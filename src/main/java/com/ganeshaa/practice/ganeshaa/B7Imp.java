package com.ganeshaa.practice.ganeshaa;

import java.util.HashMap;
import java.util.Map;

public class B7Imp {//frequency of element using single loop:
    public static void main(String[] args) {
        int[] arr= new int[]{2,3,5,7,2,5,9,2,5,7,2,5};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer>m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
