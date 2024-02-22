package com.ganeshaa.prepInsta.arrays;

class AB{
	public AB() {
		System.out.println("default a");
	}
	public AB(int a) {
		System.out.println("parametric a");
	}
	
}
class CD extends AB{
	public CD() {
		System.out.println("default B");
	}
	public CD(int a ) {
		System.out.println("parametic  B");
	}
	
	
}
public class ABCD {
	public static void main(String []args) {
		AB b = new CD(1);
//		CD d = new CD(1);
		
		
	}
	
}
