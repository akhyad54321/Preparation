package com.ganeshaa.TOPICS.Topic1.stringg;

import java.util.List;
import java.util.stream.Collectors;

public class JtpConcatenation {
	public static void main(String[] args) {
		String s1 = "akash";
		String s2 = "Yadav";
//		
		System.out.println(s1 + s2);
//		
		String s3 = s1.concat(s2);
		System.out.println(s3);
//		
		String s4 = String.join(" # ", s1,s2);
		System.out.println(s4);
		
//		String s5 = String.join(" * ", s1, s2);
//		System.out.println(s5);

		
		StringBuilder b1 = new StringBuilder("Hello");
		StringBuilder b2 = new StringBuilder("World");
		
//		StringBuilder b3 = b1.append(b2);
//		System.out.println(b3);
		
		StringBuffer b11 = new StringBuffer("rahul");
		StringBuffer b22 = new StringBuffer("kesarwani");
//		
//		StringBuffer b33 = b11.append(b22);
//		System.out.println(b33);
		
//		String s3 = String.join("",s1,s2);
//		System.out.println(s3);
//		String s4 = String.join(" $ ",s1, s2);
//		System.out.println(s4);
		
		List<String> list = List.of("abc", "xyz", "pqr");
		String collect = list.stream().collect(Collectors.joining(","));
		System.out.println(collect);
	}
}
