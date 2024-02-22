package com.ganeshaa.TOPICS.Topic6.lifecycle;

public class Samosa {
	private double price;
	
	

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting Price : ");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Init Method : ");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy Method  :");
	}
	
	
}
