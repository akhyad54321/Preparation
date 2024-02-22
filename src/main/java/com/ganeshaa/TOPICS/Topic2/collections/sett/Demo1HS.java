package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1HS {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Akhilesh");
		set.add("ganeshaa");
		set.add("Rohan");
		set.add("Aditya");
		set.add(null);
		set.add(null);
		set.add("Aditya");
		set.add("aditya");
		
		System.out.println(set);
		set.remove("Akhilesh");
		System.out.println(set);

		System.out.println("iterating elements");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}

//		System.out.println("//Using Iterator : ");
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println("//Using for-Each : ");
//		for(String ele : set) {
//			System.out.println(ele);
//		} 	
		
//		System.out.println("//Using forEach : ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
