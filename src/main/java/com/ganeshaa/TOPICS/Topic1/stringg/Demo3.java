package com.ganeshaa.TOPICS.Topic1.stringg;

public class Demo3 {
	public static void main(String[] args) {
		String s1 = "akash";
		String s2 = "akash";
		String s3 = new String("akash");
		
		System.out.println(s1 == s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
	}
}
