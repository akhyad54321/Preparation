package com.ganeshaa.prepInsta.patterns.number;

import java.util.Scanner;

public class Pattern2b {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		int count = 10;
		
		for(int i=1; i<= num; i++) {
			for(int j=1; j<= num-i+1; j++) {
//				System.out.print("* ");
				System.out.print(count + " ");
				count--;
			}
			System.out.println();
		}
		
	}
}
