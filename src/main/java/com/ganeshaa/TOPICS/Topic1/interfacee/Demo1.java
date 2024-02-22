package com.ganeshaa.TOPICS.Topic1.interfacee;

interface Car1{
	void display();
	public abstract void show();
	public abstract void print();
	
}

interface Car2 extends Car1{
	public static final int a = 10;
	void music();
}
public class Demo1 implements Car2{
	public static void main(String[] args) {
		Demo1 demo1 =new Demo1();
		demo1.show();
		demo1.print();
	}
	@Override
	public void display() {
		System.out.println("1");
		
	}

	@Override
	public void show() {
		System.out.println("2");
		
	}

	@Override
	public void print() {
		System.out.println("3");
		
	}

	@Override
	public void music() {
		System.out.println("4");
		
	}

}
