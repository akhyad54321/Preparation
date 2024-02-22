package com.ganeshaa.TOPICS.Topic6.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/setter/config.xml");
        Student s1 = (Student) context.getBean("student");
        Student s2 = (Student) context.getBean("student1");
        Student s3 = (Student) context.getBean("student2");

        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
