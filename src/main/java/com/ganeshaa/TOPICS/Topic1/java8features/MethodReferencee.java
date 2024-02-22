package com.ganeshaa.TOPICS.Topic1.java8features;

interface Vehicle{
	public abstract void engine();
}

class Bike{
	
	void engine() {
		System.out.println("Engine Working : ");
	}
}
public class MethodReferencee {
	public static void main(String[] args) {
//		Bike bike = new Bike();
//		Vehicle vehicle = bike::engine;
//		vehicle.engine();
		
		Bike b1 = new Bike();
		
		Vehicle v1 = b1::engine;
		v1.engine();
	}
}
