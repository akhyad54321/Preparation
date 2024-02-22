package com.ganeshaa.TOPICS.Topic1.java8features.pc;

import java.util.function.Supplier;

public class Supplierr1 implements Supplier<String>{

	@Override
	public String get() {
		return "Hello Ganeshaaa : ";
	}

	public static void main(String[] args) {
		
		Supplier<String> supplier = new Supplierr1();
		
		System.out.println(supplier.get());
		
		//Function
	}
}
