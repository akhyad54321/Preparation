package com.ganeshaa.prepInsta.arrays;

class A{
	A(){
		System.out.println("A1");
	}
	A(int a){
		System.out.println("A2");
	}
}
public class B extends A{
	B(){
		System.out.println("B1");
	}
	B(int a){
		System.out.println("B2");
	}
	
	public static void main(String[] args) {
		
//		B b = new B();
		B b1 = new B(2);
		
	}

}
