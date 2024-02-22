package com.ganeshaa.TOPICS.Topic2.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class Demo1 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		
		map.put(1, "Akhilesh");
		map.put(2, "Amir");
		map.put(3, "Viraj");
		map.put(4, "Rahul");
		map.put(5,  "Sohan");
		map.put(6,  "Laptop");
		
		System.out.println(map);
		
		
		
	}
}
