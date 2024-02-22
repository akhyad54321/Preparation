package com.ganeshaa.TOPICS.Topic4.runnable;

public class Demo2 extends Thread{
	public static void main(String[] args) {
		
		Runnable r = ()->{
			try {
				for(int i=1; i<=5; i++) {
					System.out.println(Thread.currentThread().getName() + " = " + i);
					Thread.sleep(1000);
				}
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		

	}
}
