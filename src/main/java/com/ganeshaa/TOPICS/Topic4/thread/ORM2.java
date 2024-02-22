package com.ganeshaa.TOPICS.Topic4.thread;

class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("Default : ");
	}
	public void start() {
//		super.start();
		System.out.println("Start : ");
	}
	
}

public class ORM2 {
	public static void main(String[] args) {
		
		MyThread3 t1 = new MyThread3();
		t1.start();
	}
}
