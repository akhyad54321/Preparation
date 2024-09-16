package com.ganeshaa.practice.stringg;

import java.util.HashMap;
import java.util.Map;

public class Fre1 {
    public static void main(String[] args) {
        String str = "aeioeiuauuaa";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            int count = 1;
            for (int j=i+1; j<str.length(); j++){
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
