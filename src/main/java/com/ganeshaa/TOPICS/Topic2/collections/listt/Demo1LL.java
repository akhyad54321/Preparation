package com.ganeshaa.TOPICS.Topic2.collections.listt;

import java.util.LinkedList;

class Book1 {  
int id;  
String name;
 
public Book1(int id, String name) {  
    this.id = id;  
    this.name = name;  
  
}

@Override
public String toString() {
	return "Book1 [id=" + id + ", name=" + name + "]";
}


} 

public class Demo1LL {
	public static void main(String[] args) {
		
		LinkedList<Book1> list = new LinkedList<>();
		Book1 b1=new Book1(101,"Let us C");  
	    Book1 b2=new Book1(102,"Data Communications");  
	    Book1 b3=new Book1(103,"Operating System"); 
	    
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    
	    System.out.println("----------");
	    list.forEach(e->{
	    	System.out.println(e);
	    });
	    
	    System.out.println("----------");

	    
	    for(Book1 book1 : list) {
	    	System.out.println(book1);
	    }
		
	}
}
