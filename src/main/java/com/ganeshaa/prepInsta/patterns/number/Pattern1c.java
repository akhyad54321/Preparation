package com.ganeshaa.prepInsta.patterns.number;

import java.util.Scanner;

public class Pattern1c {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		int count = 1;
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(count + " ");
				count = count + 1;
			}
			System.out.println();
		}
	}
}
