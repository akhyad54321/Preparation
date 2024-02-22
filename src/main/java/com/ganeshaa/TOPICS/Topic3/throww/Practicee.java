package com.ganeshaa.TOPICS.Topic3.throww;

import java.util.Scanner;

class YoungerAgeExceptionn extends RuntimeException{
	public YoungerAgeExceptionn(String msg) {
		super(msg);
	}
	
	public YoungerAgeExceptionn() {
		System.out.println("NIKAL");
	}
	
}
public class Practicee {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the Age : ");
		int age = scanner.nextInt();
		try {
			if(age < 18) {
//				throw new YoungerAgeExceptionn("Age Criteria doesnot Match : ");
				throw new YoungerAgeExceptionn();

			}
			else {
				System.out.println("Voting Done : ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program ends : ");
		}
		
	}
}
