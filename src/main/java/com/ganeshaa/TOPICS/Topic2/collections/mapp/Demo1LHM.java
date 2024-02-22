package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.*;
import java.util.LinkedHashMap;

public class Demo1LHM {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		map.put(1, 10);
		map.put(2,20);
		map.put(6, 30);
		map.put(3, 30);
		map.put(4, 40);
		
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		
		
	}
}
