package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class SwapUsing3Variables {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a : ");
		int a = scanner.nextInt();
		System.out.print("Enter b : ");
		int b = scanner.nextInt();
		int c;
		
		System.out.println("Before Swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
