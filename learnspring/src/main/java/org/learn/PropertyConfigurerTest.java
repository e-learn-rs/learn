package org.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyConfigurerTest
{
	public static void main(String args[]) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		Environment e = (Environment) context.getBean("environment");
		e.printEnv(); 
	}

}
