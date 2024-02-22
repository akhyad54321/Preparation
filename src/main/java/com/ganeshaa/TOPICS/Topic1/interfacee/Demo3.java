package com.ganeshaa.TOPICS.Topic1.interfacee;

interface I2{
	void display();
	void show();
}
interface I3 extends I2{
	void display1();
	void show1();
}

class Blank{
	void music() {
		System.out.println("music");
	}
//	abstract void pen();
}
public class Demo3 extends Blank implements I2, I3{
	public static void main(String[] args) {
		Demo3 demo3= new Demo3();
		demo3.music();
		demo3.display();
	}

	@Override
	public void display1() {
		System.out.println("d1");
		
	}

	@Override
	public void show1() {
		System.out.println("s1");
		
	}

	@Override
	public void display() {
		System.out.println("d2");
		
	}

	@Override
	public void show() {
		System.out.println("s2");
		
	}
}
