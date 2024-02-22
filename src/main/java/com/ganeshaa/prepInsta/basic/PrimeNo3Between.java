package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class PrimeNo3Between {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		boolean b = false;
		
		System.out.print("Enter Num : ");
		int num = scanner.nextInt();
		
		for(int i=2; i<=num; i++) {
			boolean b = false; // because we have to find prime no of each no : 

			for(int j=2; j<i; j++) {
				if(i%j==0) {
					b=true;
				}
			}
			
//			if(b==true) {
//				System.out.println(i + " =  Not Prime No");
//			}
//			else {
//				System.out.println(i + " = Prime No");
//			}
			
			if(b!=true) {
				System.out.println(i + " = Prime No");
			}
		}
		
	}
}
