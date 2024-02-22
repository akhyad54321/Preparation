package com.ganeshaa.TOPICS.Topic3.trycatchfinally;

class Bookk{
	static int a=100, b=0,c;
	void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("HI");
		}
		System.out.println("Hello");
	}
	
	void m2() {
//		try {
//			c = a/b;
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
		c = a/b;
	}
}
public class ExceptionPropogationn {
	public static void main(String[] args) {
		Bookk bookk = new Bookk();
		bookk.m1();
	}
}
