package com.ganeshaa.practice.ganeshaa;

import java.util.HashMap;
import java.util.Map;

public class C8Imp {
    public static void main(String[] args) {
        String name = "aeiouaeeibuya";
        char[] ch = name.toCharArray();

        Map<Character, Integer>map = new HashMap<>();
        for (int i=0; i<name.length(); i++){
            int count = 1;
            for (int j=i+1; j<name.length(); j++){
                if (ch[i] == ch[j]){
                    count++;
                }
            }
            map.putIfAbsent(ch[i], count);
        }

        for (Map.Entry<Character, Integer> m: map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
