package com.ganeshaa.TOPICS.Topic1.java8features.Optionall;

interface Parent{
	void show();
}
public class Demo6Lambda {
	public static void main(String[] args) {

		Parent p1 = ()->{
			System.out.println("This is Show method");
		};
		p1.show();
	}
}
