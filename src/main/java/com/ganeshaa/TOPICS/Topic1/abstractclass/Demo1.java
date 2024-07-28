package com.ganeshaa.TOPICS.Topic1.abstractclass;

abstract class Test{
	abstract void run();
	abstract void show();
	void print() {
		System.out.println("print");
	}
}

public class Demo1 extends Test {
	public static void main(String[] args) {
		
		Demo1 d11 = new Demo1();
//		d11.show();
//		d11.run();
		d11.print();
	
	
	}

	@Override
	void run() {
		System.out.println("run");
	}

	@Override
	void show() {
		System.out.println("show");
		
	}
	@Override
	void print() {
		super.print();
		System.out.println("printttttt");
	}
}
