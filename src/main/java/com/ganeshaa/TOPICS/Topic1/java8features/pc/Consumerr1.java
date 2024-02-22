package com.ganeshaa.TOPICS.Topic1.java8features.pc;

import java.util.function.Consumer;

public class Consumerr1 implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer 1 : " + t);
		
	}
	
	public static void main(String[] args) {
		Consumer<Integer> consumer = new Consumerr1();
		consumer.accept(5);
	}


}
