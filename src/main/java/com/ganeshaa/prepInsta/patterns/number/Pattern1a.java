package com.ganeshaa.prepInsta.patterns.number;

import java.util.Scanner;

public class Pattern1a {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
