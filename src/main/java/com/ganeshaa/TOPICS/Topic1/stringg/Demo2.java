package com.ganeshaa.TOPICS.Topic1.stringg;

public class Demo2 {
	public static void main(String[] args) {
		String name = "Akhilesh";
		String str = "";
		
		for(int i=0; i<name.length(); i++) {
//			str = str + name.charAt(i);
			str = name.charAt(i) + str;
		}
		System.out.println(str);
	}
}
