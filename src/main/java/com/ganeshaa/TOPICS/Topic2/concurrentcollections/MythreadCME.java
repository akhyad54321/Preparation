package com.ganeshaa.TOPICS.Topic2.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class MythreadCME extends Thread {
	static ArrayList<Integer> list = new ArrayList<>();
	
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Child thread tries to update list " );
			list.add(100);
			list.add(200);
			list.add(300);
		} catch (InterruptedException e) {
			System.out.println(e);
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		MythreadCME t1 = new MythreadCME();
		t1.start();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);
			Thread.sleep(3000);
		}
		
		System.out.println(list);
		
	}
}
