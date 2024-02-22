package com.ganeshaa.TOPICS.Topic1.interfacee;

@FunctionalInterface
interface Carr{
	public abstract void show();
	
	default void music() {
		System.out.println("1");
	}
	
	static void print() {
		System.out.println("print");
	}
}
public class Practicee implements Carr {

	@Override
	public void show() {
		System.out.println("shoe");
		
	}
	
	public static void main(String[] args) {
		
		Carr carr = new Practicee();
		carr.show();
		carr.music();
//		carr.print();
	}
	
}
