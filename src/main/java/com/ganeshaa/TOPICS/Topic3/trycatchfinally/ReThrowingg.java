package com.ganeshaa.TOPICS.Topic3.trycatchfinally;

//class Emp{
//	static int a=100, b=0,c;
//}
public class ReThrowingg {
	static int a=100, b=0,c;
	public static void main(String[] args) {
		
//		try {
//			c = a/b;
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		try {
			c = a/b;
		} catch (Exception e) {
			throw new ArrayIndexOutOfBoundsException("Hello");
		}
	}
}
