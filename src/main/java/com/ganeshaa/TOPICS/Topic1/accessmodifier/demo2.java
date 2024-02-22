package com.ganeshaa.TOPICS.Topic1.accessmodifier;

class Test1{
	 int id = 10;
	 void print() {
		System.out.println("Print");
	}
	
	protected Test1() {
		
	}
}
public class demo2 {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.println(test1.id);
		test1.print();
	}
}
