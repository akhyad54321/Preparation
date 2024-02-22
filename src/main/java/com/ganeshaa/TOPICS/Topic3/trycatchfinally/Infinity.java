package com.ganeshaa.TOPICS.Topic3.trycatchfinally;

public class Infinity {
	public static void main(String[] args) {
		
		try {
			double a = 10.0/0;
			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
