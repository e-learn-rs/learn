package org.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceTest 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
		Batch batch = (Batch)context.getBean("batch_parent"); 
		System.out.println(batch.getStudents());
	} 

}
 