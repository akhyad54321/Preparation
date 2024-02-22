package com.ganeshaa.TOPICS.Topic3.trycatchfinally;

public class Demo1 {
	static int a=100, b, c; 
	public static void main(String[] args) {
		
		try {
			c = a/b; 
		}
		
//		catch (Exception e) { 
//			System.out.println(e);
//		}
//		catch (ArithmeticException e1) { // we cannot write child exception after parent exception : 
//			System.out.println(e1);
//		}
		
		catch (ArithmeticException e1) { 
			System.out.println("Arithmetic Exception : " + e1);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block : ");
		}
		System.out.println("End of PROGRAM  :");
	}
}
