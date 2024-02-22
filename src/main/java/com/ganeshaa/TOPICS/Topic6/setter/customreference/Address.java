package com.ganeshaa.TOPICS.Topic6.setter.customreference;

public class Address {
	private String city;
	private String location;
	public Address() {
		super();
		System.out.println("Default constructor of Address");
	}
	public Address(String city, String location) {
		super();
		this.city = city;
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", location=" + location + "]";
	}
	
	
}
