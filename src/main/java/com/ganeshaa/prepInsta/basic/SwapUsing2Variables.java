package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class SwapUsing2Variables {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a : ");
		int a = scanner.nextInt();
		System.out.print("Enter b : ");
		int b = scanner.nextInt();
		
		System.out.println("Before Swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
