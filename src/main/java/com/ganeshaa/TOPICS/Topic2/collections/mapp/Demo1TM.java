package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.Map;
import java.util.TreeMap;

public class Demo1TM {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Akhilesh");
		map.put(2, "Ashish");
		map.put(10, "Bikas");
		map.put(3, "Aniket");
		map.put(4, "Vimlesh");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}
}
