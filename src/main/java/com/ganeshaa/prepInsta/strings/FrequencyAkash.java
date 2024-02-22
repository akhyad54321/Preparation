package com.ganeshaa.prepInsta.strings;

import java.util.HashMap;

public class FrequencyAkash {
	public static void main(String[] args) {
		
//		char [] arr = {'a', 'k', 'h', 'k', 's' ,'d'}; OR
		String name = "aeiouieaeeee";
		
		char [] str = name.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
//		int count = 1;
		
		for(int i=0; i<name.length(); i++) {
			int count = 1;
			
			for(int j=i+1; j<name.length(); j++) {
				if(str[i] == str[j]) {
					count++;
				}
			}
			map.putIfAbsent(str[i], count);
//			count = 1;
		}
		System.out.println(map);
	}
}
