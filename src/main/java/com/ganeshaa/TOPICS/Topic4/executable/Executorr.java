package com.ganeshaa.TOPICS.Topic4.executable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test extends Thread{
	
	int number;
	public Test(int number) {
		this.number = number;
	}
	
	public void run() {
		
		System.out.println("Thread" + number +" started");

		for(int i=number*100; i<=number*100 + 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Thread" + number +" ended");

	}
}
public class Executorr {
	public static void main(String[] args) {
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new Test(1));
		executor.execute(new Test(2));
		executor.execute(new Test(3));
		executor.execute(new Test(4));
		executor.execute(new Test(5));
		executor.execute(new Test(6));

		executor.shutdown();

		
	}
}
