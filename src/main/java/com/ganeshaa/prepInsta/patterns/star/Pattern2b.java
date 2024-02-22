package com.ganeshaa.prepInsta.patterns.star;

import java.util.Scanner;

public class Pattern2b {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j=num; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
