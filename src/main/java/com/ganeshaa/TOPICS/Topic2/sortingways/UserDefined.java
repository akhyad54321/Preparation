package com.ganeshaa.TOPICS.Topic2.sortingways;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee implements Comparable<Employee>{
	public int id;
	public String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee e1) {
		return this.name.compareTo(e1.name);
	}
//	@Override
//	public int compareTo(Employee e2) {
//		return this.id - e2.id;
//	}
	
	
}
public class UserDefined {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(1, "Akhilesh");
		Employee e2 = new Employee(3, "Zumit");
		Employee e3 = new Employee(2, "Virat");
		
		list.add(e1); list.add(e2); list.add(e3);
		
		Collections.sort(list);
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
