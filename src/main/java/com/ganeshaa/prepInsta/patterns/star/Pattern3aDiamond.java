package com.ganeshaa.prepInsta.patterns.star;

import java.util.Scanner;

public class Pattern3aDiamond {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num-1; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=i-1; k++) {
		
				System.out.print("* ");
			}
			for(int l=1; l<=i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=num-i; j++) {
				System.out.print("* ");
			}
			for(int j=num; j>=i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
