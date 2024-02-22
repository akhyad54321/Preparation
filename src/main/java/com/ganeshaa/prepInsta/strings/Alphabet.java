package com.ganeshaa.prepInsta.strings;

public class Alphabet {
	public static void main(String[] args) {
		
		String name = "Akhilesh)(*&&asd";
		String str = name.toLowerCase();
		
		String a = "";
		String n = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if((ch >= 'a' && ch <= 'z')) {
				a = a + str.charAt(i);
			}
			else {
				n = n + str.charAt(i);
			}
		}
		
		System.out.println(a);
		System.out.println(n);
				
	}
}
