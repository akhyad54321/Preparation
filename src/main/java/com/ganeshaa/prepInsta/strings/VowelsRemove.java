package com.ganeshaa.prepInsta.strings;

public class VowelsRemove {
	public static void main(String[] args) {
		
		String name = "akhilesh";
		String str = "";
		
		str = name.replaceAll("[aeiou]", "");
		System.out.println(str);

//		String vowels = "";
//		String con = "";
//		for(int i=0; i<name.length(); i++) {
//			char ch = name.charAt(i);
//			
//			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//				vowels = vowels + ch;
//			}
//			else {
//				con = con + ch;
//			}
//		}
//		System.out.println("vowels = "+ vowels);
//		System.out.println("con = " + con);
	}
	
}
