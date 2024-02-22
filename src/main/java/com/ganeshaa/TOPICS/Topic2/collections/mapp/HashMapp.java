package com.ganeshaa.TOPICS.Topic2.collections.mapp;

import java.util.HashMap;
import java.util.Map;

class Book{
	 int id; 
	String name;
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Book b = (Book)obj;
		return this.id == b.id;
	}
	
	
}
public class HashMapp {
	public static void main(String[] args) {
		
		HashMap< Book, Integer> map = new HashMap<Book, Integer>();
		Book b1 = new Book(1, "Akhilesh");
		Book b2 = new Book(3, "Akash");
		Book b3 = new Book(3, "Vimlesh");
		Book b4 = new Book(4, "Raju");
		Book b5 = new Book(5, "Akhil");
		
		map.put(b1, 1);		
		map.put(b2, 2);
		map.put(b3, 3);
		map.put(b4, 4);
		map.put(b5, 5);
		
//		map.put( new Book(1, "Akhilesh"), 1);		
//		map.put( new Book(3, "Akash"), 2);
//		map.put( new Book(3, "Vimlesh"), 3);
//		map.put( new Book(4, "Raju"), 4);
//		map.put( new Book(5, "Akhil"), 5);
		
		for(Map.Entry<Book, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
//			System.out.println(m.getValue());
			
//			Book b = m.getValue();
//			System.out.println(b.id + " - " + b.name );
			
		}

	}
}
