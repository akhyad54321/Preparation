package com.ganeshaa.TOPICS.Topic2.collections.queuee;

import java.util.PriorityQueue;

class Book implements Comparable<Book>{
	int id;
	String name;
	
	public Book(int id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Book b) {
		return this.id - b.id;
	}
	
}
public class PriorityQueuee {
	public static void main(String[] args) {
		
		PriorityQueue<Book> queue = new PriorityQueue<>();
		
		 	Book b1=new Book(121,"Let us C");  
		    Book b2=new Book(233,"Operating System");  
		    Book b3=new Book(101,"Data Communications");
		    
		    queue.add(b1);
		    queue.add(b2);
		    queue.add(b3);
		    
//		    System.out.println(queue);
		    
		    queue.forEach(e->{
		    	System.out.println(e);
		    });
	}
}
