package com.ganeshaa.TOPICS.Topic1.java8features.pc;

import java.util.function.Predicate;

public class Predicatee2{
	public static void main(String[] args) {
		
	Predicate<Integer> p1 = i->i%2==0;
	System.out.println(p1.test(2));
	System.out.println(p1.test(3));
		
	
//		 Predicate<Integer> predicate =(t) -> {
//				if(t%2==0) {
//					return true;
//				}
//				else {
//				return false;
//				}
//			};
//			
//			System.out.println(predicate.test(2));
			
	
		
	}
}
