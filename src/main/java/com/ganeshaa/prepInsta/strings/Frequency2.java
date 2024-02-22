package com.ganeshaa.prepInsta.strings;

public class Frequency2 {
	public static void main(String[] args) {
		
		String name = "aeioueio";
		int [] freq = new int[name.length()];
		
		char [] str = name.toCharArray();
		
		for(int i=0; i<name.length(); i++) {
			freq[i] = 1;
			for(int j=i+1; j<name.length(); j++) {
				
				if(str[i] == str[j]) {
					freq[i]++;
					str[j] = '0';
				}
			}
		}
		
		System.out.println("PRINTING : ");
		for(int i=0; i<freq.length; i++) {
			if(str[i] != ' ' && str[i] != '0') {
				System.out.println(str[i] + " " + freq[i]);
			}
		}
	}
}
