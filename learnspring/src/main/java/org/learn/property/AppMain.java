package org.learn.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ReadValue rv = context.getBean("readValue",ReadValue.class);
		rv.printProperties(); 
	}

}
