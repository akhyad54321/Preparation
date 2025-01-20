package com.ganeshaa.practice.servosys;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.HashMap;
import java.util.Map;

public class Code4 {
    public static void main(String[] args) {
        char[] ch = new char[]{ 'a', 's', 'f','g','a','a','s','s','s','f','f'};

        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<ch.length; i++){
            if (map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }else {
                map.put(ch[i], 1);
            }
        }

        System.out.println(map);
    }
}
