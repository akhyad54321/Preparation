package com.ganeshaa.practice.stringg;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String name = "nitinnn";
        char[] str = name.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<name.length(); i++){
            int count = 1;
            for (int j=i+1; j<name.length(); j++){
                if (str[i] == str[j]){
                    count++;
                }
            }
            map.putIfAbsent(str[i], count);
        }

        System.out.println("map = " + map);
    }
}
