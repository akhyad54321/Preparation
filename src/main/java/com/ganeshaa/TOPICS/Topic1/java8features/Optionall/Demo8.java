package com.ganeshaa.TOPICS.Topic1.java8features.Optionall;

interface Mobile{
	int show(int a);
}
public class Demo8 {
	public static void main(String[] args) {
		Mobile m = (int q) ->{
			return q;
		};
		System.out.println(m.show(5));

//		Mobile mobile = (a)->{
//			return a;
//		};
//		System.out.println(mobile.show(10));
	}
	
		
}
