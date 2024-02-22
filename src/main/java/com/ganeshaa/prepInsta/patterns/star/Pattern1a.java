package com.ganeshaa.prepInsta.patterns.star;

import java.util.Scanner;

public class Pattern1a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter row : ");
		int row = scanner.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
