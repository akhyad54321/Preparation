package com.ganeshaa.TOPICS.Topic1.stringg;

public class Jtpcompare {
	public static void main(String[] args) {
		String s1 = "Akash";
		String s2 = "Akash";
		String s3 = new String("Akash");
		String s4 = "akash";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s4.compareTo(s1));
//		System.out.println(s1.compareToIgnoreCase(s4));
	}
}
