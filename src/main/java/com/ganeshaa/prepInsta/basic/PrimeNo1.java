package com.ganeshaa.prepInsta.basic;

public class PrimeNo1 {
	public static void main(String[] args) {
		
		int num = 8;
		boolean b=false;
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				b=true;
//				System.out.println( i + " " + "Prime");
			}
//			else {
//				System.out.println( i + " " + "Not Prime");
//			}
		}
		if(b==true) {
			System.out.println(num + " = Not Prime : ");
		}
		else {
			System.out.println(num + " = Prime");
		}
		
		
	}
}
