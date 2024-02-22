package com.ganeshaa.TOPICS.Topic1.java8features;

public class Runnableee {

	public static void main(String[] args) {
		
		Runnable r1 = ()->{
			try {
				for(int i=1; i<=5; i++) {
					Thread.sleep(1000);
					System.out.println("value = " + i);
				}
			}
			catch (Exception e) {
				System.out.println(e);
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
