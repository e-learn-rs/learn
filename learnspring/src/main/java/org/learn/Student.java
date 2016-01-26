package org.learn;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean
{
	private String name;

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("InitializingBean init method called for Student");
		
	}

	public void destroy() throws Exception {
		System.out.println("Disposable bean destroy method is called");
		
	}

}
