package com.ganeshaa.practice.ganeshaa;

import java.util.HashMap;
import java.util.Map;

public class C9Imp {// frequency using single loop:
    public static void main(String[] args) {
        String name = "aeiouaeeibuya";
        char[] ch = name.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<name.length(); i++){
            if (map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }
            else{
                map.put(ch[i], 1);
            }
        }

        map.forEach((key, value)-> System.out.println("key = " + key + "  value = " + value));
    }
}
