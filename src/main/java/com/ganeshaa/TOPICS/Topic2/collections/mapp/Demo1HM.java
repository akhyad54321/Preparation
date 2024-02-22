package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.HashMap;
import java.util.Map;

public class Demo1HM {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Akhilesh");
		map.put(2, "Akhish");
		map.put(3, "Vimlesh");
		map.put(4, "Siddhesh");
		map.put(5, "Raju");
		map.put(5, "raju");
		map.put(null, "Mobile");
		
//		System.out.println(map);

		
//		for(Map.Entry<Integer, String> m: map.entrySet()) {
//			System.out.println(m.getKey() + " - " + m.getValue());
//		}

		for (Map.Entry<Integer, String> m: map.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("========");
		
		System.out.println(map.keySet());
		System.out.println(map.values());
				
	}
}
