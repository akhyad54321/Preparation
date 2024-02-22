package com.ganeshaa.TOPICS.Topic2.collections.listt;

import java.util.Enumeration;
import java.util.Stack;

public class Demo1Stack {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println("------------------------------------");

		Enumeration<Integer> elements = stack.elements();
		while (elements.hasMoreElements()){
			System.out.println(elements.nextElement());
		}
//		Enumeration<Integer> itr = stack.elements();
//		while(itr.hasMoreElements()) {
//			System.out.println(itr.nextElement());
//		}
	}
}
