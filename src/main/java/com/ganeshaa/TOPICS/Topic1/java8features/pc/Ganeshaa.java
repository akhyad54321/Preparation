package com.ganeshaa.TOPICS.Topic1.java8features.pc;

import org.hibernate.event.spi.SaveOrUpdateEvent;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;
import java.util.function.Function;

public class Ganeshaa {
	public static void main(String[] args) {
		
//		Predicate<Integer> predicate = (Integer a)->{
//			if(a%2==0) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//		
//		System.out.println(predicate.test(3));
//		Predicate<Integer> predicate1 = i->i%2==0;
//		System.out.println(predicate1.test(2));
		
//		Function<Integer, Integer> f1 = i->i*i;
//		System.out.println(f1.apply(3));
//
//		Function<Integer, String> f2 = i->i*i + "Akhilesh";
//		System.out.println(f2.apply(3));
//
//		Function<String, Integer> f3= s->s.length();
//		System.out.println(f3.apply("Akhilesh"));
//
//		Function<String, String> f4 = s->s.toLowerCase();
//		System.out.println(f4.apply("AKHILESH"));

		Function<Integer, Integer> f1 = i-> i*i;
		System.out.println(f1.apply(5));

		Function<Integer, String> f2 = i->i*i + "AAKHIELDJD";
		System.out.println(f2.apply(9));
		
	}
	

}
