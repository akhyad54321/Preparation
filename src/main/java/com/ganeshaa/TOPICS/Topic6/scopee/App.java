package com.ganeshaa.TOPICS.Topic6.scopee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/scopee/config.xml");
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1.hashCode());
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());
		
		Student s2 = (Student) context.getBean("student");
		System.out.println(s2.hashCode());
	}
}
