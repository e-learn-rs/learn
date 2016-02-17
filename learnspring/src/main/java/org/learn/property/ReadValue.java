package org.learn.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("readValue") 
public class ReadValue 
{
 	@Autowired 
	private Environment environment;
	
	public void printProperties()
	{
		System.out.println(environment.getProperty("url"));   
	}

}
