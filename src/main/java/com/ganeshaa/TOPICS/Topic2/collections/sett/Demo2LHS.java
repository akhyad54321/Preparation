package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Demo2LHS {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);list.add(120);list.add(30);list.add(40);list.add(60);
//		System.out.println(list);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
		System.out.println("set = " + set);
		set.add(10);
		set.add(null);
		
		System.out.println(set);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
