package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.RecursiveTask;

class Employee implements Comparable<Employee>{
	int id;
	String name;
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
	public int compareTo(Employee emp1){
		return this.name.compareTo(emp1.name);
	}
	
//	public int compareTo(Employee e1) {
//		return this.id - e1.id;
//	}
	
//	public int compareTo(Employee e1) {
//		return this.name.compareTo(e1.name);
//	}
//

	
	
}
public class TreeHashSett {
	public static void main(String[] args) {
		
		TreeSet<Employee> set = new TreeSet<Employee>();
		
		Employee e1 = new Employee(1, "Akhilesh");
		Employee e2 = new Employee(2, "Akhilesh");
		Employee e3 = new Employee(3, "Vimlesh");
		Employee e4 = new Employee(3, "Sagar");
		Employee e5 = new Employee(5, "Sumit");
		
		set.add(e1); set.add(e2); set.add(e3); set.add(e4); set.add(e5);
		
//		System.out.println(set);
		
		Iterator<Employee> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
