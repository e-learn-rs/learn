package org.learn.aop;

import org.learn.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain
{
	public static void main(String args[])
	{
		ApplicationContext ax = new ClassPathXmlApplicationContext("spring.xml"); 
		ShapeService shapeService = ax.getBean("shapeSerive",ShapeService.class); 
	// 	shapeService.getCircle().setName("Dummy name"); 
	 	
	//	shapeService.getCircle().getDoubleName("robin"); 
	//	System.out.println(shapeService.getCircle().getName());  
		
	//	System.out.println(shapeService.getCircle().getName()); 
	//	shapeService.getCircle().getMethodForException();
	//	shapeService.getCircle().getName(); 
	//	shapeService.getCircle().method1ForCommonAdvice();
	//	shapeService.getTriangle().method2ForCommonAdvice(); 
	//	shapeService.getCircle().methodForCustomAdvice(); 
		shapeService.getCircle().getDoubleName("rrr"); 
	}

} 
