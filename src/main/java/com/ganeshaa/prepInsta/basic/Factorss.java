package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class Factorss {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = scanner.nextInt();
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
