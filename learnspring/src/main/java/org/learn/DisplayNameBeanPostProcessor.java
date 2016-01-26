package org.learn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor
{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
	{
		System.out.println("After initializing bean :: "+beanName); 
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException 
	{ 
		System.out.println("Before Initializing bean :: "+beanName); 
		return bean;
	}
  
}
