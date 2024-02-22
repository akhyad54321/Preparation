package com.ganeshaa.TOPICS.Topic1.java8features.pc;

import java.util.function.Predicate;

public class Predicatee1 implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}
		else {
		return false;
		}
	}

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = new Predicatee1();
		System.out.println(predicate.test(2));
	}
}



