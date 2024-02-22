package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}
}
