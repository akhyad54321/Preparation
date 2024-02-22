package com.ganeshaa.prepInsta.patterns.star;

import java.util.Scanner;

public class Pattern1b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of Num : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j-- ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
