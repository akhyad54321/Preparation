package com.ganeshaa.TOPICS.Topic6.setter;

public class Student {
	private int id;
	private String name;
	private String address;
	public Student() {
		super();
		System.out.println("Default Constructor : ");
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
//		System.out.println("id");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
//		System.out.println("name");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
//		System.out.println("address");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
