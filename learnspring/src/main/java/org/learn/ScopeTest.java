package org.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
		Line l = (Line)context.getBean("line"); 
		l.getPointA().setX(15);
		l.getPointB().setX(20); 
		l.draw();
		Line l2 = (Line)context.getBean("line");
		l2.draw();
	} 

}
