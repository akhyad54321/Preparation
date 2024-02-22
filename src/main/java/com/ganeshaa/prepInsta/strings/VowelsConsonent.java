package com.ganeshaa.prepInsta.strings;

public class VowelsConsonent {
	public static void main(String[] args) {
		
		String str = "Akhilesh";
		String str2 = str.toLowerCase();
		int v = 0;
		int c = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				v = v + 1;
			}
			else {
				c = c + 1;
			}
		}
		System.out.println("Vowel = " + v);
		System.out.println("Consonent = " + c);
		
	}
}
