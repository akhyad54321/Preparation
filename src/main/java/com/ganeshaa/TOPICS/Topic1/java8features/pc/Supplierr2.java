package com.ganeshaa.TOPICS.Topic1.java8features.pc;

import java.util.function.Supplier;

public class Supplierr2{
	public static void main(String[] args) {

	Supplier<String> s1 = ()-> "Ganeshaa";
	System.out.println(s1.get());
		
		
//		Supplier<String> supplier = ()->{
//			return "Ganeshaa";
//		};
//		System.out.println(supplier.get());
	}
}
