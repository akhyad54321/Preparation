package com.ganeshaa.prepInsta.strings;

public class Toggle {
	public static void main(String[] args) {
		
		String name = "AkhiLESh";
		String toggle = "";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
		
			if(Character.isUpperCase(ch)) {
				toggle = toggle + Character.toLowerCase(ch);
			}
			else {
				toggle = toggle + Character.toUpperCase(ch);
			}
		}
		
		System.out.println(toggle);
		
	}
}
	
	
