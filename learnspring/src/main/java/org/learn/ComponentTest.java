package org.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentTest 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		ComponentA ca = (ComponentA)context.getBean("componentA");
		ca.greetings();
	} 

}
