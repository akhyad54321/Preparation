package com.ganeshaa.TOPICS.Topic1.stringg;

public class JtpMethods {
	public static void main(String[] args) {
		
		String s = "AkhilEsh";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		
//		System.out.println(s.trim());
		
		System.out.println(s.startsWith("Ak"));
		System.out.println(s.endsWith("sh"));
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.length());
		
		String s1 = "java is good java is java";
		System.out.println(s1);
		String s2 = s1.replace("java", "python");
		System.out.println(s2);
		
	}
}
