package org.learn.property;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:app.properties" }) 
public class AppConfig 
{   
	// @ComponentScan(basePackages = "org.learn")
}
