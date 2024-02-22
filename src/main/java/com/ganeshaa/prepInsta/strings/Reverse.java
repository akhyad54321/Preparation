package com.ganeshaa.prepInsta.strings;

public class Reverse {
	public static void main(String[] args) {
		
		String str = "Akhilesh";
		String str1 = "";
		
		for(int i=0; i<str.length(); i++) {
			str1 = str.charAt(i) +  str1;
		}
		
		System.out.println(str1);
				
	}
}
