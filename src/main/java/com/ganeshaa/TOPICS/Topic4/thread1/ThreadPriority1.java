package com.ganeshaa.TOPICS.Topic4.thread1;

class Parent extends Thread{
	public void run() {
		System.out.println("Run : ");
	}
}
public class ThreadPriority1 {
	public static void main(String[] args) {
		
		System.out.println("main = " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("main = " + Thread.currentThread().getPriority());

		
		Parent parent = new Parent();
		parent.start();
		System.out.println("child = " + Thread.currentThread().getPriority());
	}
}
