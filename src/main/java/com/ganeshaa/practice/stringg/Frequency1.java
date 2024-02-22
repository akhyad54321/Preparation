package com.ganeshaa.practice.stringg;

import java.util.HashMap;
import java.util.Map;

public class Frequency1 {
    public static void main(String[] args) {
        String name = "aaeioeeuioiaa";
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < name.length(); i++) {
            char[] keyChar = name.toCharArray();
            if (map.containsKey(keyChar[i])) {
                Integer intCount = map.get(keyChar[i]);
                map.put(keyChar[i], intCount + 1);
            } else {
                map.put(keyChar[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
