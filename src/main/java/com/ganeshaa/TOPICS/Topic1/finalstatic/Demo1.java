package com.ganeshaa.TOPICS.Topic1.finalstatic;

class Test{
	static int a = 10;
	static void show() {
		System.out.println("show 1: ");
	}

	
}
class Test1{
	int b = 20;
	void show() {
		System.out.println("show 2 : ");
	}
}

public class Demo1 {
	
	static {
		System.out.println("BELL");
	}
	public static void main(String[] args) {
		
		 System.out.println(Test.a);
		 Test.show();
		 
		 Test1 t1 = new Test1();
		 System.out.println(t1.b);
		 t1.show();
		 
		 
		 
	}
}
