package com.ganeshaa.TOPICS.Topic3.trycatchfinally;

public class Demo2 {
	public static void main(String[] args) {
		
		try {
			int a = 100;
			int b=0, c;
			c = a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("--------");
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println("--------");
			System.out.println(e.getMessage());
		}
		System.out.println("End : ");
	}
}
