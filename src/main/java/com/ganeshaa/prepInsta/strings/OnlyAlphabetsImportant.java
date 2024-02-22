package com.ganeshaa.prepInsta.strings;

public class OnlyAlphabetsImportant {
	public static void main(String[] args) {
		
		String name = "Akhilesh123##$$";
		String str = "";
		String str1 = "";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				str = str + ch;
			}
			else {
				str1 = str1 + ch;
			}
		}
		
		System.out.println(str);
		System.out.println(str1);
	}
}
