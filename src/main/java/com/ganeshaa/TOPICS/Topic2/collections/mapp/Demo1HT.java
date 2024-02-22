package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.Hashtable;
import java.util.Map;

public class Demo1HT {
	public static void main(String[] args) {
		
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		table.put(10,10 );
		table.put(2,20 );
		table.put(3,30 );
		table.put(10, 11);
		table.put(4,40 );
		table.put(5,50 );
		table.put(11, 110);
//		table.put(null, 56);
		
		System.out.println(table);
	}
}
