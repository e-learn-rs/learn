package org.learn;

public class Environment 
{
	private String env;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	
	public void printEnv()
	{
		System.out.println("Environment is :: "+this.env);  
	}
	 

}
