package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class NaturalNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter value of n : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
}
