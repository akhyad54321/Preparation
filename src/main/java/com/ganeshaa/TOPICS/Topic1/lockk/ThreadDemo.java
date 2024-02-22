package com.ganeshaa.TOPICS.Topic1.lockk;

public class ThreadDemo {
	public static void main(String[] args) {
		
		ClassLockDemo c = new ClassLockDemo();
		Thread t1 = new Thread(()->{
			synchronized (ClassLockDemo.class) {
				ClassLockDemo.method1();	
			}
		});
		
		Thread t2 = new Thread(()->{
			synchronized (ClassLockDemo.class) {
				ClassLockDemo.method3();
			}
		});
		
		Thread t3 = new Thread(() -> {
			synchronized (c) {
				c.method4();
			}
		});
		
		Thread t4 = new Thread(() -> {
			synchronized (c) {
				c.method5();
			}
		});
		
		Thread t5 = new Thread(() -> {
			c.method6();
		});
		
		Thread t6 = new Thread(() -> {
			c.method2();
		});
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
	}
}

