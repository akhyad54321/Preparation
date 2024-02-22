package com.ganeshaa.TOPICS.Topic4.raceanddeadlock;

public class Deadlockk1 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().join();// i.e main thread is waiting for main thread  : Deadlock
		for(int i=1; i<=5; i++) {
			System.out.println("Main THREAD :  : ");
		}
	}
}
