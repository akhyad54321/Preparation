package com.ganeshaa.TOPICS.Topic2.sortingways;

import java.util.ArrayList;
import java.util.Collections;

public class WrapperClasses {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(30);
		list.add(40);
		list.add(12);
		list.add(34);
		list.add(1);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
