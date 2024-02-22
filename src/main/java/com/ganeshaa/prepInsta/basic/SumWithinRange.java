package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class SumWithinRange {
	public static void main(String[] args) {
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting range : ");
		int s = scanner.nextInt();
		System.out.println("Enter ending range : ");
		int e = scanner.nextInt();
		
		for(int i=s; i<=e; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
