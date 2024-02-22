package com.ganeshaa.TOPICS.Topic1.overriding;

class Pen{
	
	Object show() {
		System.out.println("pen - show :");
		return null;
		
	}
}

class Pencil extends Pen{
	
	@Override
	String show() {
		super.show();
		System.out.println("pencil - show : ");
		return null;
	}
}
public class Practicee extends Pencil {
	public static void main(String[] args) {
		
		Practicee p1 = new Practicee();
		p1.show();
	}
}
