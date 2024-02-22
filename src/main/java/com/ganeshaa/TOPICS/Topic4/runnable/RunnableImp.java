package com.ganeshaa.TOPICS.Topic4.runnable;

class Parent extends Thread{
	
	public void run() {
		System.out.println("Run Method : ");
	}
}
public class RunnableImp {
	public static void main(String[] args) {
//
//		Parent p1 = new Parent();
//		p1.start();
		
		Parent p2 = new Parent();
		Thread t1 = new Thread(p2);
		t1.start();
	}
}
