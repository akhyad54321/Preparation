package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of Num : ");
		int num = scanner.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}
}
