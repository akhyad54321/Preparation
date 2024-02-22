package com.ganeshaa.prepInsta.strings;

public class Toggle1 {
	public static void main(String[] args) {
		
		String name = "AkhiLESh";
		String toggle = "";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
		
			if(ch >= 'A' && ch <='Z') {
				toggle = toggle + Character.toLowerCase(ch);
			}
			else {
				toggle = toggle + Character.toUpperCase(ch);
			}
		}
		
		System.out.println(toggle);
	}
}
