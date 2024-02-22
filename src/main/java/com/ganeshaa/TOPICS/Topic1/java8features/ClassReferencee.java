package com.ganeshaa.TOPICS.Topic1.java8features;

interface Mobilee{
	void music();
}

class MobileUse{
	public static void music() {
		System.out.println("Music");
	}
}
public class ClassReferencee {
	public static void main(String[] args) {
		
		Mobilee m1 = MobileUse::music;
		m1.music();
	}
}
