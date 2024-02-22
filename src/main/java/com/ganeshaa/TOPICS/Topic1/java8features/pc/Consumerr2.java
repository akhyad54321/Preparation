package com.ganeshaa.TOPICS.Topic1.java8features.pc;

import java.util.function.Consumer;

public class Consumerr2{
	public static void main(String[] args) {
		
	Consumer<Integer> c1 = i->System.out.println(i);
	c1.accept(3);
		
		
		
		
		
		
//		Consumer<Integer> consumer =  (t) -> {
//			System.out.println("Consumer 1 : " + t);
//		};
//		
//		consumer.accept(10);
		
	}
}
