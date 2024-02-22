package com.ganeshaa.TOPICS.Topic1.abstractclass;

abstract class Test1{
	abstract void run();
	abstract void show();
	void print() {
		System.out.println("print");
	}
}

abstract class Test2 extends Test1{

	abstract void print();
}

class Test3 extends Test2{

	@Override
	void print() {
		System.out.println("1");	
	}

	@Override
	void run() {
		System.out.println("2");
	}

	@Override
	void show() {
		System.out.println("3");
	}
	
}

public class Demo2 {
	public static void main(String[] args) {
		
		Test1 test1 = new Test3();
		test1.print();
		test1.run();
		test1.show();
		
	}
}                                                                                                                          
