package com.ganeshaa.TOPICS.Topic2.sortingways;

import java.util.ArrayList;
import java.util.Collections;

public class StringObjects {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Akhilesh");
		list.add("Akash");
		list.add("Vaishnav");
		list.add("Sagar");
		list.add("Aniket");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
