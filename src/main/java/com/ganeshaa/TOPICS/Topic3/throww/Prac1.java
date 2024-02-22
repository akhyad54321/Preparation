package com.ganeshaa.TOPICS.Topic3.throww;

import java.util.Scanner;

public class Prac1 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter age : ");
		int age = scanner.nextInt();
		
		try {
			if(age<18) {
				throw new ArithmeticException("hi");
//				System.out.println("hello");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program ends : ");
		}
	}
}
