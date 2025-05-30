package com.ganeshaa.TOPICS.Topic4.thread1;

class MyThread1 extends Thread{
	public void run() {
		System.out.println("Default" + "-" + Thread.currentThread().getName());
	}
	
	public void run(int a) {
		System.out.println("Paramaterised : ");
	}
}

public class OverloadRunMethod {
	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
//		t1.start();
		t1.run();
//		t1.run(3);
	}
}
