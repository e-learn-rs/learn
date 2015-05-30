package singletonDesignPattern;

public class SingletonClass 
{
	
	private SingletonClass()
	{
		System.out.println("In constructor");  
	}
	
	private static SingletonClass instance = new SingletonClass();
	
	public static SingletonClass getInstance()
	{
		return instance;
	}
	
	public void showMessage(String name)
	{
		System.out.println("Welcome "+name);  
	}
	
	
	
	

}
