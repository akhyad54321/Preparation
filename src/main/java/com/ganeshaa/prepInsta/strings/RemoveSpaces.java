package com.ganeshaa.prepInsta.strings;

public class RemoveSpaces {
	public static void main(String[] args) {
	//	" " ASCII Value of space is 32 : 
		String name = "Ak hi lesh Yad  av";
		String str = "";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(ch != ' ') {
				str = str + ch;
			}
		}
		
		System.out.println(str);
	}
}
