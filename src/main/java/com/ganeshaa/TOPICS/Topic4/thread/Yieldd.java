package com.ganeshaa.TOPICS.Topic4.thread;

class Parent2 extends Thread{
	public void run() {
		try {
			for(int i=1; i<=3; i++) {
				Thread.sleep(1000);
				System.out.println("Run : ");
//				Thread.yield();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

public class Yieldd {
	public static void main(String[] args) {
		
		Parent2 p = new Parent2(); 
		p.start();
		
		try {
			for(int i=1; i<=3; i++) {
				Thread.sleep(1000);
				System.out.println("main : ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
