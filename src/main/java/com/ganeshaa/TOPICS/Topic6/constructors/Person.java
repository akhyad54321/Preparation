package com.ganeshaa.TOPICS.Topic6.constructors;

public class Person {
	private int id;
	private String name;
	
	private Certificate certi;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi + "]";
	}
	
	
}
