package com.ganeshaa.practice.stringg;

import java.util.HashMap;
import java.util.Map;

public class S1 {
    public static void main(String[] args) {
        String name = "nitinnn";
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<name.length(); i++) {
//            map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0) + 1);
            map.put(name.charAt(i),map.getOrDefault(name.charAt(i), 0) + 1);
        }
        System.out.println(map);
    }
}
