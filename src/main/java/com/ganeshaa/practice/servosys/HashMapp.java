package com.ganeshaa.practice.servosys;

import java.util.HashMap;
import java.util.Map;

public class HashMapp{
    public static void main(String[] args) {
        char[] ch = new char[]{ 'a', 's', 'f','g','a','a','s','s','s','f','f'};
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Single loop to count character frequencies without using getOrDefault
        for (int i = 0; i < ch.length; i++) {
            if (frequencyMap.containsKey(ch[i])) {
                // If the character exists in the map, increment its count
                frequencyMap.put(ch[i], frequencyMap.get(ch[i]) + 1);
            } else {
                // If the character is not in the map, initialize it with count 1
                frequencyMap.put(ch[i], 1);
            }
        }

        // Iterate over the frequency map and classify based on even or odd count
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char key = entry.getKey();
            int count = entry.getValue();
            String countType = (count % 2 == 0) ? "even" : "odd";
            System.out.println(key + " - " + countType);
        }
    }
}