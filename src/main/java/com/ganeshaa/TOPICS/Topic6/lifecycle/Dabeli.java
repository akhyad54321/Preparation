package com.ganeshaa.TOPICS.Topic6.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Dabeli {
	private double price;

	public Dabeli() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dabeli(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dabeli [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Init Method  :");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroy Method  :");
	}
}
