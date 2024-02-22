package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.Map;
import java.util.TreeMap;

class Employee1 implements Comparable<Employee1>{
	int id;
	String name;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee1 e1) {
		return this.id - e1.id;
	}
}
public class TreeMapp {

	public static void main(String[] args) {
		
		TreeMap<Employee1, Integer> map = new TreeMap<Employee1, Integer>();
		Employee1 b1 = new Employee1(1, "Akhilesh");
		Employee1 b2 = new Employee1(3, "Akash");
		Employee1 b3 = new Employee1(3, "Vimlesh");
		Employee1 b4 = new Employee1(4, "Raju");
		Employee1 b5 = new Employee1(5, "Akhil");
		
		map.put( b1, 1);
		map.put( b2, 2);
		map.put( b3, 3);
		map.put( b4, 4);
		map.put( b5, 5);
		
		
//		System.out.println(map);
		
		for(Map.Entry<Employee1, Integer> m:map.entrySet()) {
			Employee1 e1 = m.getKey();
			System.out.println(e1.id + " - " + e1.name);
		}
		
		
	}
}
