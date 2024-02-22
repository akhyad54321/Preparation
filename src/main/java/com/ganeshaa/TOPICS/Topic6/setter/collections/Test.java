package com.ganeshaa.TOPICS.Topic6.setter.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Ganeshaa");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/setter/collections/cconfig.xml");
		
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1.getName());
		System.out.println(e1.getAddress());
		System.out.println(e1.getCourses());
		System.out.println(e1.getPhones());

	}

}
