package com.ganeshaa.prepInsta.strings;

public class Palindromee {
	public static void main(String[] args) {
		
		String str = "nitin";
		String str1 = "";
		
		for(int i=0; i<str.length(); i++) {
			str1 = str.charAt(i) +  str1;
		}
		
		System.out.println(str1);
		
		if(str.equals(str1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
