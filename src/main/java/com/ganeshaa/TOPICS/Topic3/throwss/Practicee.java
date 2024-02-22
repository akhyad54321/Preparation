package com.ganeshaa.TOPICS.Topic3.throwss;

class Driverr {
	void m1() throws ClassNotFoundException {
		Class c = Class.forName("com.mysql.cj.jdbc.Driver"); 
	}
}
public class Practicee {
	public static void main(String[] args) {
		
		Driverr d1 = new Driverr();
		try {
			d1.m1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}
