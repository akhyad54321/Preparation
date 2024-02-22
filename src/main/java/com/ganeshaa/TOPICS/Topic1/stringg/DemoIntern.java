package com.ganeshaa.TOPICS.Topic1.stringg;

public class DemoIntern {
	public static void main(String[] args) {
		
		String s1 = new String("Akhilesh");
		String s2 = s1; // s2 will point to "Akhilesh" present in heap area, not in string constant pool area :
		System.out.println(s1 == s2);
		
		String s3 = s1.intern();
		System.out.println(s1 == s3);
	}
}
