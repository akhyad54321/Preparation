package com.ganeshaa.prepInsta.basic;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rev = 0;
		System.out.println("enter no : ");
		int no = scanner.nextInt();
		
		while(no!=0) {
			int d = no % 10;       // 
			System.out.println(" int d = " + d); 
			rev = rev * 10 + d;    //
			System.out.println("rev = " + rev);
			no = no / 10;			//
			System.out.println("no = " + no);
			System.out.println("=====================");
		}
		
		System.out.println(rev);
	}
}
