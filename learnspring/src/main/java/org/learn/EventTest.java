package org.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");   
		Circle shape = (Circle)context.getBean("circle"); 
		shape.publishEventForCircle();
	} 

}
