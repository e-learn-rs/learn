package org.learn.aop.model;

import org.learn.aspect.SelfAnnotation;

public class Circle 
{
	private String name; 

	public Circle()
	{
		 
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//throw(new RuntimeException()); 
	}
	
	public String getDoubleName(String name)
	{
		return name+name;
	}
	
	public String getMethodForException()
	{
		throw(new RuntimeException());  
	}
	
	public void method1ForCommonAdvice()
	{
		System.out.println("Printing method 1 for common  advice");  
	}
	
	@SelfAnnotation
	public void methodForCustomAdvice()
	{
		System.out.println("Method for custom advice");  
	}

}
