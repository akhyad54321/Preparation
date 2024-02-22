package com.ganeshaa.prepInsta.patterns.number;

import java.util.Scanner;

public class Pattern3b {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
//		int a = 0;
		for(int i=1; i<=num; i++) {
			int a = 1;
			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
				System.out.print(a + " ");
				a++;
			}
		
			System.out.println();
		}
	}
}
