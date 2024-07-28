package com.ganeshaa.TOPICS.Topic1.overloading;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("string");

//		int[] a = new int[10];
//		main(a);
//		double[] b = new double[10];
//		main(b);
		
	}
	
	public static void main(int[] args) {
		System.out.println("integer");
	}
	
	public static void main(double[] args) {
		System.out.println("double");
	}
}
