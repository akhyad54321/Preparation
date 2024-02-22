package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class Greater3No {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 no : ");
		int n1 = scanner.nextInt();
		System.out.println("Enter 2nd no : ");
		int n2 = scanner.nextInt();
		System.out.println("Enter 3rd no : ");
		int n3 = scanner.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1);
		}
		else if(n2 > n3) {
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
	}
}
