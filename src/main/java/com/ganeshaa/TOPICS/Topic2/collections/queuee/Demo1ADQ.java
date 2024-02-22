package com.ganeshaa.TOPICS.Topic2.collections.queuee;

import java.util.ArrayDeque;

public class Demo1ADQ {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(40);
		
		System.out.println(queue);
		
		queue.addFirst(1);
		queue.addLast(9);
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
	
	}
}
