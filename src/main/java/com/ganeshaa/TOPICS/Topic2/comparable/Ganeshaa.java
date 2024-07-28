package com.ganeshaa.TOPICS.Topic2.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>{
	private int id;
	private String name;
	public Book(int id, String name) {
		this.id=id;
		this.name=name;
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
	public int compareTo(Book b1) {
		return this.name.compareTo(b1.name);
	}

//	@Override
//	public int compareTo(Book b1) {
//		return this.id - b1.id;
//	}
//
	
}
public class Ganeshaa {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book b1 = new Book(1, "Akhilesh");
		Book b2 = new Book(2, "Hanumanji");
		Book b3 = new Book(3, "Sanket");
		Book b4 = new Book(4, "Akash");
		
		list.add(b1);
		list.add(b3);
		list.add(b2);
		list.add(b4);
		
		Collections.sort(list);
		for(Book book : list) {
			System.out.println(book.getId() + " - " +  book.getName());
		}
	}
}
