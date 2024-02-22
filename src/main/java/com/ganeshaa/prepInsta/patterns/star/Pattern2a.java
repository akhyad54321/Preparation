package com.ganeshaa.prepInsta.patterns.star;

import java.util.Scanner;

public class Pattern2a {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num-i; j>=1; j--) {
				System.out.print("  ");
			}
//			System.out.println();
			for(int k=1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
