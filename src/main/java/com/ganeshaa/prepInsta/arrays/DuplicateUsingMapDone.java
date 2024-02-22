package com.ganeshaa.prepInsta.arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateUsingMapDone {
public static void main(String[] args) {
	
	int [] arr = {10,2,33,4,2,10,33,4,67,5,4,8,7,8,9,4,67};
	int count = 1;
	
	HashMap<Integer, Integer> map = new HashMap<>();
	
	for(int a : arr) {
		if(map.get(a) == null) {
			map.put(a, count);
		}
		else {
			map.put(a, count + 1);
		}
	}
	
	System.out.println("Elements" + "  Frequency");
	for(Map.Entry<Integer, Integer> m:map.entrySet()) {
		System.out.println(m.getKey() + "      -      " + m.getValue());
	}
}
}
