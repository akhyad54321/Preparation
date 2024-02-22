package com.ganeshaa.prepInsta.patterns.number;

import java.util.Scanner;

public class SandglassPattern {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Num : ");
			int num = scanner.nextInt();
			
			for(int i=1; i<=num; i++) {
				for(int j=2; j<=i; j++) {
					System.out.print("  ");
				}
				for(int j=1; j<=num-i+1; j++) {
					System.out.print("* ");
				}
				for(int j=1; j<=num-i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num-i; j++) {
					System.out.print("  ");
				}
				for(int j=1; j<=i-1; j++) {
					System.out.print("* ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
