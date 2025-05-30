package com.ganeshaa.TOPICS.Topic4.raceanddeadlock2;

class Parent extends Thread{
	static Thread mainn;  
	
	public void run() {
		try {
			mainn.join();  // child thread is waiting for main thread : 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1; i<=5; i++) {
			System.out.println("Run : ");
		}
	}
}

public class Deadlockk {
	
	public static void main(String[] args) throws InterruptedException {
		
		Parent.mainn = Thread.currentThread();   
		
		
		Parent p = new Parent(); 
		p.start();
		
		p.join(); // main thread is waiting for child thread :
		for(int i=1; i<=5; i++) {
			System.out.println("main : ");
		}
	}
}
