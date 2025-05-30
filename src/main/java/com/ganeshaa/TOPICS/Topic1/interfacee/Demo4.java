package com.ganeshaa.TOPICS.Topic1.interfacee;

@FunctionalInterface
interface f1{
	public abstract void show();
	default void detail() {
		System.out.println("1");
	}
	static void music() {
		System.out.println("music");
	}
	
	private void m1() {
		System.out.println("hie");
	}
	
}
public class Demo4 implements f1{

	@Override
	public void show() {
		System.out.println("show");
		
	}
	
	public static void main(String[] args) {
		Demo4 demo4 = new Demo4();
		demo4.show();
		demo4.detail();
//		demo4.m1();
//		demo4.music();
	}
}
