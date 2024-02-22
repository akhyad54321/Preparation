package com.ganeshaa.TOPICS.Topic2.comparator;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
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
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class Comparatorrr {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(1, "Akhilesh");
		Employee e2 = new Employee(3, "Sameer");
		Employee e3 = new Employee(2, "Manoj");
		Employee e4 = new Employee(4, "Akash");
		
		list.add(e4);
		list.add(e3);
		list.add(e2);
		list.add(e1);
		
//		Collections.sort(list, new IdComparator());
		Collections.sort(list, new NameComparator());
		for(Employee emp : list) {
			System.out.println(emp.getId() + " - " + emp.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
