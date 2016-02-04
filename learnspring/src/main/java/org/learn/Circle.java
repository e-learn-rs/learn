package org.learn;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component 
public class Circle implements Shape, ApplicationEventPublisherAware 
{ 
	
	private ApplicationEventPublisher publisher;
//	@Autowired
//	@Qualifier("circleRelated") 
	private Point center; 
	
	@Autowired 
	private MessageSource messageSource;
  
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	} 

	//@Required 
	@Resource(name="zeroPoint") 
	public void setCenter( Point center) { 
		this.center = center;
	}  

	public void draw() 
	{
		System.out.println(this.messageSource.getMessage("greeting",null,"Hey!!", null));  
		System.out.println(this.messageSource.getMessage("circle.draw",new Object[]{center.getX(),center.getY()},"Drawing Circle", null));  
	//	System.out.println("Drawing circle having center at x-coordinate at [ "+center.getX()+" ]. y-coordinate at [ "+center.getY()+" ] ");  
	}  
	
	public void publishEventForCircle()
	{
		CustomEvent customEvent = new CustomEvent(this);
		publisher.publishEvent(customEvent); 
	}
	
	@PostConstruct
	public void initCircleBean()
	{
		System.out.println("Initializing Circle bean");
	}

	@PreDestroy
	public void destroyCircleBean()
	{
		System.out.println("Destroying Circle bean");  
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		 
		this.publisher = publisher;
	}
}
