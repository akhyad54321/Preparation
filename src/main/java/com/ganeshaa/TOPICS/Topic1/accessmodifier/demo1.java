package com.ganeshaa.TOPICS.Topic1.accessmodifier;

class Test{
	int id = 11;
	
//	private Test() {
//		
//	}
	protected Test(int id) {
		this.id=id;
	}
	
}

public class demo1 {
	public static void main(String[] args) {
		Test t = new Test(10);
		System.out.println(t.id);
	
	}
}
