package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class SumofDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no : ");
		int num = scanner.nextInt();
		int sum = 0;
		while(num != 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
