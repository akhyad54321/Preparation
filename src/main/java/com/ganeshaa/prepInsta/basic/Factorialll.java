package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class Factorialll {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of num : ");
		int num = scanner.nextInt();
		
		int fact = 1;
		for(int i=2; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
