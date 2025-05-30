package com.ganeshaa.TOPICS.Topic4.thread1;

class MyThread extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
	}
}
