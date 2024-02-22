package com.ganeshaa.TOPICS.Topic3.throww;

import java.util.Scanner;

class YoungerAgeException extends Exception{
	
	public YoungerAgeException(String msg) {
		super(msg);
	}
	
	public YoungerAgeException() {
		System.out.println("Age Less : ");
	}
}
public class Demo1 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) throws YoungerAgeException {
		
		System.out.println("Enter age : ");
		int age = scanner.nextInt();

			if(age < 18) {
				throw new YoungerAgeException("Age is Less Than 18 :  ");
			}
			else {
				System.out.println("Voting Done : ");
			}
	}
}
