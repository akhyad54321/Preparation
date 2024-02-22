package com.ganeshaa.TOPICS.Topic2.collections.mapp.practice;

import java.util.HashMap;
import java.util.Map;

class Bookkk{
	 int id; 
	String name;
	public Bookkk(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bookkk [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Bookkk bookkk = (Bookkk)obj;
		return this.id == bookkk.id;
	}
	
	
}
	
public class Practicee {
	public static void main(String[] args) {
		HashMap< Bookkk, Integer> map = new HashMap<Bookkk, Integer>();

		map.put( new Bookkk(1, "Akhilesh"), 1);		
		map.put( new Bookkk(3, "Akash"), 2);
		map.put( new Bookkk(3, "Vimlesh"), 3);
		map.put( new Bookkk(4, "Raju"), 4);
		map.put( new Bookkk(5, "Akhil"), 5);
		
		for(Map.Entry<Bookkk, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
			
		}
	}
}
