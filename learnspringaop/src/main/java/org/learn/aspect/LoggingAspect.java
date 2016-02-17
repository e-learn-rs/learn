package org.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect 
{
//	@Before("execution(public String getName())") 
	public void LoggingAdvice()
	{
		System.out.println("In Logging advice");
	} 
	
//	@Before("execution(public String org.learn.aop.model.Circle.getName())") 
	public void LoggingBeforeCircleAdvice() 
	{ 
		System.out.println("Logging advice before Circle getName");  
	}
	
//	@Before("execution(* get*(..))") 
	public void singleAdviceForMultiplePointsAdvice()
	{
		System.out.println("Advice called for getter of any type 'n any parameters");    
	}
	
	
 //	@Before("allGetters()")
	public void firstAdvice()
	{
		System.out.println("First Advice");
	}  
	
//	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("Second Advice"); 
	}  
	
  	@Pointcut("execution(* get*(..))") 
	public void allGetters()
	{} 
	
	@Pointcut("within(org.learn.aop.model.Circle)") 
	public void allMethods(){} 
	
	//@Before("allMethods()") 
	public void beforeEveryMethodAdvice()
	{
		System.out.println("Before every method of circle");
	}
	
 	@Before("allGetters() && allMethods()")
	public void inAllGettersOfCircleAdvice()
	{
		System.out.println(" Executing inAllGettersOfCircleAdvice for all methods"); 
	}
	
	
 	@Before("allMethods()")
	public void allCircleMethodsAdvice(JoinPoint joinPoint) 
	{
		// To differentiate between getters and setters of Circle class.
		String joinPointStr = joinPoint.toString();
		if(joinPointStr.contains("get"))
		{
			System.out.println("Join point is getter method");
		}
		else if(joinPointStr.contains("set"))
		{
			System.out.println("Join point is setter method");
		}  
		
	}
	
//	@Before("args(String)")
	public void argsAdvice()
	{
		System.out.println("Method having String arguments is called");
	}
	
	
	//To know what arguement is passed
//	@Before("args(nam)")
	public void stringArguementsMethods(String nam)
	{
		System.out.println("Value of arguement is :: "+nam); 
	}
	
//	@After("args(nam)")
	public void stringArguementsMethodsAfterExecution(String nam)
	{
		System.out.println("Value of arguement is :: "+nam); 
	}
	
//	@AfterReturning("args(nam)")
	public void afterSuccessfulExecutionAdvice(String nam)
	{
		System.out.println("Method succesfully executed") ;
 	}  
	
	//@AfterReturning(pointcut = "args(name)" , returning = "returningString" )
	public void returningArgsAdvice( String returningString,String name )
	{
		System.out.println("Input :: "+name);
		System.out.println("Output :: "+returningString); 
	}
	
	//@AfterThrowing("args(name)") 
	public void afterExceptionThrownAdvice(String name)
	{
		System.out.println("An exception has been thrown...");  
	}
	
	//@AfterThrowing(pointcut = "args(name)" , throwing = "ex")
	public void logExceptionThrownAdvice(String name , RuntimeException ex)
	{  
		 System.out.println("An exception is thrown "+ex); 
	}
	 
	@Around("allGetters()")  
	public Object allGettersAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object value = null;
		System.out.println("Before Executing :: "+proceedingJoinPoint.toString());   
		try 
		{			
			 value = proceedingJoinPoint.proceed();
			 System.out.println("Executed succesfully...");  
		}
		catch (Throwable e) 
		{  
			System.out.println("Exception thrown");   
			e.printStackTrace();
		} 
		return value; 
		
	}
	
	@Pointcut("execution(* org.learn.aop.model.Circle.method1ForCommonAdvice())") 
	public void circleCommonAdvice(){} 
	
	@Pointcut("execution(* org.learn.aop.model.Triangle.method2ForCommonAdvice())")  
	public void triangleCommonAdvice(){}   
	
	@Before("circleCommonAdvice() && triangleCommonAdvice()")
	public void commonAdvice()
	{
		 System.out.println("Executing common advice");  
	}
	
	@Before("@annotation(org.learn.aspect.SelfAnnotation)")
	public void customAdvice()
	{
		System.out.println("Executing custom annotation");  
	}
	
}
