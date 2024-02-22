package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = scanner.nextInt();
		int temp = num;
		int rev = 0;
		
		while(num !=0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		if(rev == temp) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
}
