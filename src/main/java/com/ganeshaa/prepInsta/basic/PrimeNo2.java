package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class PrimeNo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean b = false;
		
		System.out.print("Enter the Num : ");
		int num = scanner.nextInt();
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				b=true;
			}
		}
		
		if(b==true) {
			System.out.println(num + " = Not Prime : ");
		}
		else {
			System.out.println(num + " = Prime  : ");
		}
	}
}
