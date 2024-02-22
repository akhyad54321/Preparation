package com.ganeshaa.TOPICS.Topic1.overriding;

class Parent1{
	public void show() {
		System.out.println("show");
	}
	void print() {
		System.out.println("print");
	}
	static void music() {
		System.out.println("MUSIC");
	}
	final void call() {
		System.out.println("call");
	}
	private void mobile() {
		System.out.println("he");
	}
}

class Child1 extends Parent1{
	@Override
	public void show() {
		System.out.println("-----------show");
	}
	@Override
	void print() {
		System.out.println("-------print");
	}
	
//	final void call() {
//		System.out.println("call");
//	}
//	
//	@Override
//	private void mobile() {
//		System.out.println("he");
//	}
//	@Override
//	static void music() {
//		System.out.println("MUSIC");
//	}
	
	
}
public class Demo2 {
	public static void main(String[] args) {
//		Child1 child1 = new Child1();
//		child1.print();
		Parent1 parent1 = new Child1();
		parent1.print();
	}
}
