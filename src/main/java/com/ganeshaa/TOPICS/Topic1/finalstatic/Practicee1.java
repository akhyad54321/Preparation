package com.ganeshaa.TOPICS.Topic1.finalstatic;

class Book{
	static int a = 10;
	static void show() {
		System.out.println("1");
	}

}
public class Practicee1 {
	
	static {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("============================");
	}
	
	public static void main(String[] args) {
		System.out.println(Book.a);
		Book.show();
		
		
		
	}
}
