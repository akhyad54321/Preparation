package com.ganeshaa.TOPICS.Topic1.java8features;

interface Mobile{
	int show(int a);
}
public class Demo8 {
	public static void main(String[] args) {
//		Mobile m2 = (int a)->{
//			return a;
//		};
//
//		System.out.println(m2.show(3));

		Mobile mobile = (a)->{
			return a;
		};
		System.out.println(mobile.show(10));
	}
	
		
}
