package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

class Emp{
	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp)obj;
		return this.id == emp.id;
	}

	
	
}
public class Practicee {
	public static void main(String[] args) {
		
		HashSet<Emp> set = new HashSet<>();
		Emp e1 = new Emp(1, "Akhilesh");
		Emp e2 = new Emp(2, "Akhi");
		Emp e3 = new Emp(3, "Viraj");
		Emp e4 = new Emp(4, "Suraj");
		Emp e5 = new Emp(4, "Ganeshaa");

		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		
		Iterator<Emp> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}


}
