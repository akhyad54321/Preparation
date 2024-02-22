package com.ganeshaa.prepInsta.strings;

public class VowelsConsonent1 {
	public static void main(String[] args) {
		
		String str = "Ganeshaa";
		String str1 = str.toLowerCase();
		
		String vowel = "";
		String consonent = "";
		
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
				vowel = vowel + str1.charAt(i);
			}
			else {
				consonent = consonent + str1.charAt(i);
			}
		}
		System.out.println( "Vowel = " + vowel);
		System.out.println("Consonent = " + consonent);
	}
}
