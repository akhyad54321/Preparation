package com.ganeshaa.prepInsta.strings;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		
		String s1 = "Silent";
		String s2 = "Listen";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() == s2.length()) {
			char [] str1 = s1.toCharArray();
			char [] str2 = s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			if(Arrays.equals(str1, str2) == true) {
				System.out.println("Anagrams : ");
			}
			else {
				System.out.println("Not Anagrams Inner Loop : ");
			}
		}
		else {
			System.out.println("Not Anagram Outer Loop : ");
		}
		
	}
}
