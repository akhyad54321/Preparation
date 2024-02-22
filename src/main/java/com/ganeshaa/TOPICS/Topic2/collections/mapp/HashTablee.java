package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.Hashtable;
import java.util.Map;

class Bookk{
	int id;
	String name;
	double salary;
	
	public Bookk(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Bookk [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class HashTablee {
	public static void main(String[] args) {
		
		Hashtable<Integer, Bookk> table = new Hashtable<Integer, Bookk>();
		
		Bookk b1 = new Bookk(1, "Akhilesh", 50000);
		Bookk b2 = new Bookk(2, "Ashish", 40000);
		Bookk b3 = new Bookk(3, "Anish", 30000);
		Bookk b4 = new Bookk(4, "Abhay", 60000);
		Bookk b5 = new Bookk(5, "Aniruddha", 70000);

		table.put(1, b1);
		table.put(2, b2);
		table.put(3, b3);
		table.put(4, b4);
		table.put(5, b5);
		
		for(Map.Entry<Integer, Bookk> m:table.entrySet()) {
//			System.out.println(m.getKey() + " - " + m.getValue());/
			
			Bookk b = m.getValue();
			System.out.println(b.id + " - " + b.name + " - " + b.salary);
		}
		
	}
}
