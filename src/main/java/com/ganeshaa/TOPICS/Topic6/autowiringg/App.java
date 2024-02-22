package com.ganeshaa.TOPICS.Topic6.autowiringg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiringg/config.xml");
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getAddress());
	
	}
}
