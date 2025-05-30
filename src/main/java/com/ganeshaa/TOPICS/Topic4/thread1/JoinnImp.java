package com.ganeshaa.TOPICS.Topic4.thread1;

class Parent3 extends Thread{
	static Thread mainn;  //1
	
	public void run() {
		try {
			mainn.join();  //3
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1; i<=5; i++) {
			System.out.println("Run : ");
		}
	}
}

public class JoinnImp {
	
	public static void main(String[] args) throws InterruptedException {
		
		Parent3.mainn = Thread.currentThread();   //2
		
		
		Parent3 p = new Parent3(); 
		p.start();
		
//		p.join();
		for(int i=1; i<=5; i++) {
			System.out.println("main : ");
		}
	}
}
