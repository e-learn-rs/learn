package org.learn;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceTest 
{
	public static void main(String args[])
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
	 	context.registerShutdownHook();
		Batch batch = (Batch)context.getBean("batch_child"); 
		System.out.println(batch.getStudents());
	} 

}
 