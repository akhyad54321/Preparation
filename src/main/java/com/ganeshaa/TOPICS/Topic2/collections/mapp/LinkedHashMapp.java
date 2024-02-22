package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapp {

	public static void main(String[] args) {
		
		LinkedHashMap<Employee, Integer> map = new LinkedHashMap<Employee, Integer>();
		
		Employee e1 = new Employee(10, "Akhilesh");
		Employee e2 = new Employee(20, "Sanket");
		Employee e3 = new Employee(30, "Ashish");
		Employee e4 = new Employee(30, "Ash");
		Employee e5 = new Employee(40, "Akash");
		
		map.put(e1, 1);
		map.put(e2, 2);
		map.put(e5, 3);
		map.put(e4, 4);
		map.put(e3, 5);
		
		for(Map.Entry<Employee, Integer> m:map.entrySet()) {
			Employee emp = m.getKey();
			
			System.out.println(emp.getId() + " - " + emp.getName());
		}
		
	}
}
