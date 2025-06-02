package com.ganeshaa.TOPICS.Topic4.mutualexclusive3;

class Practicee extends Thread{
	
	void show(){
		try {


			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");

			synchronized (this) {
				for(int i=1; i<=5; i++) {
					System.out.println(Thread.currentThread().getName() + " = " + i);
					Thread.sleep(1000);
				}
			}
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");


		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	@Override
	public synchronized void run() {
		show();
	}
}
public class Self1Failed {
	public static void main(String[] args) {
		
		Practicee p = new Practicee();
		p.start();
		
		Practicee p1= new Practicee();
		p1.start();
	}
}
