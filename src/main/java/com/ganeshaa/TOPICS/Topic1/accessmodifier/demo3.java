package com.ganeshaa.TOPICS.Topic1.accessmodifier;

class Test2{
	public int id = 10;
	public void print() {
		System.out.println("Printt");
	}
	
class Test3{
	public int idd = 20;
	public void show() {
		System.out.println("show:");
	}
}
}
public class demo3 { // only one class can be public :
	public static void main(String[] args) {
		Test2 test1 = new Test2();
		System.out.println(test1.id);
		test1.print();
		
	
	}
}
