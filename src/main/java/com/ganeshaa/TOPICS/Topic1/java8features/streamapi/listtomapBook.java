package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class listtomapBook {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<>();
		Book b1 = new Book(1, "python");
		Book b2 = new Book(3, "java");
		Book b3 = new Book(4, "js");
		Book b4 = new Book(5, "C++");
		Book b5 = new Book(2, "Swift");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
//		
//		System.out.println(list);
		
		Map<Integer, String> collect = list.stream().collect(Collectors.toMap(Book::getId, Book::getName));
		System.out.println(collect);
//		Map<Integer, String> collect = bookList.stream().collect(Collectors.toMap(Book::getId, Book::getName));
//		System.out.println(collect);
		
//		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Book::getId, Book::getName));
//		Map<Integer, String> collect = list.stream().collect(Collectors.toMap(Book::getId, Book::getName));
		
//		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Book::getId, Book::getName));
//		System.out.println(map);
		
		
		
		
	}
	
	
	
}
