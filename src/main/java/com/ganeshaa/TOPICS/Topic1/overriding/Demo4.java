package com.ganeshaa.TOPICS.Topic1.overriding;

class Parent3{
	public void show() {
		System.out.println("show - P");
	}
	void print() {
		System.out.println("print - P");
	}

}

class Child4 extends Parent3{
	void music() {
		System.out.println("MUSIC - C");
	}
	void call() {
		System.out.println("call - C");
	}
	@Override
	public void show() {
		super.show();
		System.out.println("show - C");
	}
	@Override
	void print() {
		System.out.println("print - C");
	}
}

public class Demo4 {
	public static void main(String[] args) {
		Child4 c4 = new Child4();
		c4.show();
	}
}
