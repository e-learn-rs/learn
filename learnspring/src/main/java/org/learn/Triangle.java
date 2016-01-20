package org.learn;

public class Triangle 
{
	private String type; 
	private int height;

	public Triangle(String type) 
	{  
		this.type = type;
	}
	
	public Triangle(Integer height) 
	{  
		this.height = height; 
	}
	
	public Triangle(String type,Integer height) 
	{  
		this.type = type;
		this.height = height; 
	}
	public String getType() {
		return type;
	}


	public void setType(String type) { 
  		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw()
	{
		System.out.println("Triangle Drawn");  
	}
}
