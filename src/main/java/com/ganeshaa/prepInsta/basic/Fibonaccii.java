package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class Fibonaccii {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of num : ");
		int num = scanner.nextInt();
		int t1 = 0;
		int t2 = 1;
		int t3;
		System.out.print(t1 + "  " + t2 + "  ");
		
		for(int i=2; i<num; i++) {
			t3 = t1+t2;
			t1 = t2;
			t2 = t3;
			
			System.out.print(t3 + "  ");

		}
		
	}

}








	