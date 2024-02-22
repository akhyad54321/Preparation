package com.ganeshaa.TOPICS.Topic1.interfacee;

interface I1{
	void display();
	void show();
}

class C1 implements I1{

	@Override
	public void display() {
		System.out.println("1");
		
	}

	@Override
	public void show() {
		System.out.println("2");
		
	}
	
}
public class Demo2 {
	public static void main(String[] args) {
		I1 i1 = new C1();
		i1.display();
		i1.show();
	}
}
