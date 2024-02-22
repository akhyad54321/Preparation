package com.ganeshaa.TOPICS.Topic6.constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructors/config.xml");
		Person p1 = (Person) context.getBean("person");
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getCerti());
	}
}
