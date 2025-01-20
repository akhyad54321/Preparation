package com.ganeshaa.practice.servosys;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;

public class Code2 { //Remove Duplicate element from Array

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,3,4,2,5,7,4};
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

        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("----------------------------------");

        map.forEach((key, value)-> System.out.println("key = "  + key + "  value = " + value));
    }
}
