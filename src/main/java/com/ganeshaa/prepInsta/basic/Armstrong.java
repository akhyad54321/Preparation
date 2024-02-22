package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		
		while(num != 0) {
			int d = num % 10;
			sum = sum + d*d*d;
			num = num /10;
		}
		
		if(temp == sum) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
}
