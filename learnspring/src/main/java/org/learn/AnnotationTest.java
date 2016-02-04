package org.learn;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest 
{
	public static void main(String args[])
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
		context.registerShutdownHook(); 
		Shape shape = (Shape)context.getBean("circle"); 
		shape.draw();
		
		//System.out.println(context.getMessage("greeting1",null,"Hey!!", null)); 
	} 

}
 