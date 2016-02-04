package org.learn;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener
{

	public void onApplicationEvent(ApplicationEvent applicationEvent) 
	{
		System.out.println(applicationEvent.toString()); 
	}

}
 