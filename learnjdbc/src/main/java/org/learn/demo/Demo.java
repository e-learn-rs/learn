package org.learn.demo;

import org.learn.dao.JdbcDaoImpl;
import org.learn.dao.SimpleJdbcDaoImpl;
import org.learn.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo 
{
	
	public static void main(String args[])
	{
		try
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		 	JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class); 
		//	Circle circle = dao.getCircle(1);   
		//	System.out.println(circle.getName());  
		//	System.out.println(dao.getCountOfCircleRecords());  
		// 	System.out.println(dao.getNameOfCircleFromIdUsingJdbcTemplate(1));
		//	System.out.println(dao.getCircleFromIdUsingJdbcTemplte(1));  
		//	dao.insertCircle(new Circle(2, "Second circle"));  
		//  	dao.insertCircle(new Circle(5, "Fifth circle"));  
		 	System.out.println(dao.getAllCircles()); 
		// 	System.out.println("Total number of circles are :: "+dao.getAllCircles().size());  
		//	dao.createTriangleTable();
			
		 //	SimpleJdbcDaoImpl dao = context.getBean("simpleJdbcDaoImpl",SimpleJdbcDaoImpl.class); 
		//	System.out.println(dao.getCountOfCircleRecords());
  		}
		catch(Exception e)
		{ 
			e.printStackTrace(); 
		}
	}

} 
