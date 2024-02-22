package com.ganeshaa.prepInsta.patterns.star;

import java.util.Scanner;

public class Pattern1c {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		
//		for(int i=1; i<=num; i++) {
		for(int i=1; i<=num-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
