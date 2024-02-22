package com.ganeshaa.TOPICS.Topic6.setter.customreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/setter/customreference/customconfig.xml");
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getAddress());
	}
}
