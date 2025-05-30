package com.ganeshaa.TOPICS.Topic1.java8features.Optionall;

import java.util.function.Predicate;

public class Practicee3 {
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (Integer i)->{
			if(i%2==0) {
				return true;
			}
			else {
				return false;
			}
			
		};
		
		System.out.println( predicate.test(4));
		System.out.println(predicate.test(5));
	}
}
