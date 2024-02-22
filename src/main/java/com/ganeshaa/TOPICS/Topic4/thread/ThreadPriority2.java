package com.ganeshaa.TOPICS.Topic4.thread;

class Parent1 extends Thread{
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println("Run : ");
		}
	}
}

public class ThreadPriority2 {
	public static void main(String[] args) {
//		Thread.currentThread().setPriority(1);
		
		Parent1 p = new Parent1();
		Thread.currentThread().setPriority(10); //Windows donot support priority method :
		p.start();
		
		for(int i=1; i<=3; i++) {
			System.out.println("main : ");
		}
	}
}
