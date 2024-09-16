package com.ganeshaa.TOPICS.Topic1.java8features;

@FunctionalInterface
interface Stringg{
	public abstract void show();
}

public class Demo7 {
	public static void main(String[] args) {

		Stringg s1 = ()->{
			System.out.println("hello");
		};
		s1.show();
		
//		Stringg string = ()->{
//			System.out.println("Hello");
//		};
//
//		string.show();
	}
}
