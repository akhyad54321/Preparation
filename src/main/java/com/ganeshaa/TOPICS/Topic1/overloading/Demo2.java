package com.ganeshaa.TOPICS.Topic1.overloading;

public class Demo2 {

	void run(String b) {
		System.out.println("2");
	}
	void run(Object a) {
		System.out.println("1");
	}
	
	void print(int a) {
		System.out.println("i");
	}
	void print(long a) {
		System.out.println("l");
	}
	
	public static void main(String[] args) {
		Demo2 demo2=new Demo2();
		demo2.run(null);
		demo2.print(20l);
		
		
	}
}
