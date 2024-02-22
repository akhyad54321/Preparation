package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.LinkedHashSet;

class Book2{
	int id;
	String name;
	public Book2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book2 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Book2 book2 = (Book2)obj;
		return this.id == book2.id;
	}
	
	
	
}
public class LinkedHashSett {
	public static void main(String[] args) {
		
		LinkedHashSet<Book2> set = new LinkedHashSet<Book2>();
		Book2 b1 = new Book2(1, "Akhilesh");
		Book2 b2 = new Book2(3, "Akash");
		Book2 b3 = new Book2(3, "Vimlesh");
		Book2 b4 = new Book2(4, "Raju");
		Book2 b5 = new Book2(5, "Akhil");
		
		set.add(b1); 
		set.add(b2); 
		set.add(b3); 
		set.add(b4); 
		set.add(b5);
		
//		System.out.println(set);
		
		for(Book2 book2 : set) {
			System.out.println(book2.id + " - " + book2.name);
		}
	}

}
