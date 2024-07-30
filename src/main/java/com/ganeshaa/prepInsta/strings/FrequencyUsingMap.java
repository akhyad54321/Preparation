package com.ganeshaa.prepInsta.strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingMap {
	public static void main(String[] args) {
		
		String name = "aeioueiaaa";
		int count = 1;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(map.get(ch) == null) {
				map.put(ch, count);
			}
			else {
				map.put(ch, count +1);
			}
		}
		
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}
		
	}
}
