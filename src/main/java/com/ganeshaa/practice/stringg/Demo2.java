package com.ganeshaa.practice.stringg;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        String name = "aeiouaiouaa";
        Map<Character, Integer> map =  new HashMap<>();
        int count = 1;

        for (int i=0; i<name.length(); i++){
            char charName = name.charAt(i);
            if (map.get(charName) == null){
                map.put(charName, count);
            }
            else {
                map.put(charName, count + 1);
            }
        }

        for(Map.Entry<Character, Integer> m: map.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }    }
}
