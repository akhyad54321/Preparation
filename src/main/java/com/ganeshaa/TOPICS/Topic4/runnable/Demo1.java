package com.ganeshaa.TOPICS.Topic4.runnable;

public class Demo1 implements Runnable{
	public void run() {
		System.out.println("Run Method : ");
	}
	
	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1();
		Thread t1 = new Thread(demo1);
		t1.start();
		
	}
}
