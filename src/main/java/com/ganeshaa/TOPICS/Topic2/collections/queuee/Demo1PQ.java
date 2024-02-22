package com.ganeshaa.TOPICS.Topic2.collections.queuee;

import java.util.PriorityQueue;

public class Demo1PQ {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(1);
		queue.add(10);
		queue.add(10);
//		queue.add(null);
		
		System.out.println(queue);
	}
}
