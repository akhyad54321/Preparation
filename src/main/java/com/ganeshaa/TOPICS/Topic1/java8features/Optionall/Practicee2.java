package com.ganeshaa.TOPICS.Topic1.java8features.Optionall;

public class Practicee2 {
	public static void main(String[] args) {
		
	Runnable r = ()->{
		
		try {
			for(int i=1; i<=5; i++) {
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	};
		Thread t1 = new Thread(r);
		t1.start();
		
		
	}
}
