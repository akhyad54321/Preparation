package com.ganeshaa.TOPICS.Topic1.overriding;

class Test1{
	Object show() {
		System.out.println("1");
		return null;
	}
}
class Test2 extends Test1{
	@Override
	String show() {
		super.show();
		System.out.println("2");
		return null;
	}
	
}
public class Demo5 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.show();
	}
}
