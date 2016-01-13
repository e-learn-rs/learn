package org.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp2 {

	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		t.draw();
	}
}
