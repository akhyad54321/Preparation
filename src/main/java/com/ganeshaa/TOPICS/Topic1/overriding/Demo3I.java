package com.ganeshaa.TOPICS.Topic1.overriding;

class Parent2{
	public void show() {
		System.out.println("show");
	}
	void print() {
		System.out.println("print");
	}

}

class Child2 extends Parent2{
	void music() {
		System.out.println("MUSIC");
	}
	void call() {
		System.out.println("call");
	}
}

class Child3 extends Parent2{
	 void mobile() {
		System.out.println("Mobile");
	}
}
public class Demo3I extends Child3 {
	public static void main(String[] args) {
		Demo3I d3 = new Demo3I();
		d3.show();
		d3.print();
		d3.mobile();
		
		Child2 c2 = new Child2();
		c2.show();
		c2.call();
		
	}
}
