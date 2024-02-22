package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.TreeSet;

public class Demo3TS {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(8);
		set.add(30);
		set.add(40);
		set.add(40);
//		set.add(null);
		
		System.out.println(set);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
