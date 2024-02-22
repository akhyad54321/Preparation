package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.HashSet;
import java.util.Iterator;

class Book{
	int id;
	String name;

	public Book() {
		super();
		System.out.println("Default Constructor : ");
	}

	public Book(int id, String name) {
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
		return "Book [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;// true pe add nhi karne dega , value false hoga to add karne degaa
	}

	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		return this.id == book.id;
	}
	
	
	
}
public class Hashsett1{
	public static void main(String[] args) {
		
		Book bookk = new Book();
		
		HashSet<Book> set = new HashSet<Book>();
		Book b1 = new Book(1, "Akhilesh");
		Book b2 = new Book(3, "Akash");
		Book b3 = new Book(3, "Vimlesh");
		Book b4 = new Book(4, "Raju");
		Book b5 = new Book(5, "Akhilesh");
		
		set.add(b1); set.add(b2); set.add(b3); set.add(b4); set.add(b5);
				
		Iterator<Book> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

		
		
		
	}
	
}
