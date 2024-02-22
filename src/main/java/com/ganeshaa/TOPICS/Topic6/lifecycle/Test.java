package com.ganeshaa.TOPICS.Topic6.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		
//		Samosa s1 = (Samosa) context.getBean("samosa");
//		System.out.println(s1);
//		context.registerShutdownHook();
		
//		Pepsi p1 = (Pepsi) context.getBean("pepsi");
//		System.out.println(p1);
//		context.registerShutdownHook();
		
		Dabeli d1 = (Dabeli) context.getBean("dabeli");
		System.out.println(d1);
		context.registerShutdownHook();
	}
}
