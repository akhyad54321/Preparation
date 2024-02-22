package com.ganeshaa.TOPICS.Topic1.finalstatic;

class Parent{
	final int a = 10;
	
	final void show() {
		System.out.println("show");
	}
	
	void print() {
		System.out.println("print");
	}
}

class Child extends Parent{
	@Override
	void print() {
		System.out.println("1");
	}
	
//	 void show() {
//		System.out.println("hiiii");
//	}
}
public class Demo2 extends Parent{
	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		
	}
	
}
