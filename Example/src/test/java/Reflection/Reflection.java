package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class Reflection 
{
	
	public static void main(String args[])
	{
		try 
		{
		int a = 10;
		int b = 20;
		Class cal = Calculator.class;
		Class Calculator = Class.forName("Reflection.Calculator");
		System.out.println("Fully qualified class name [ "+Calculator.getName()+" ] ");    
		System.out.println(" Simple name [ "+Calculator.getSimpleName()+" ]");  
		int modifiers = Calculator.getModifiers();
		System.out.println("Modifiers [ "+modifiers+" ] "); 
		Package pack = Calculator.getPackage();
		System.out.println("Package name [ "+pack.getName()+" ]"); 
		Class superClassCalculator = Calculator.getSuperclass();
		System.out.println("Super Class name [ "+superClassCalculator.getName()+" ] "); 
		Class[] calcInterfaces = Calculator.getInterfaces();
		for(Class calcInterface : calcInterfaces)
		{
			System.out.println("Calculator interface [ "+calcInterface.getName()+" ] ");
  		}  
		Constructor[] CalculatorConstructors = Calculator.getConstructors();
		System.out.println("Number of constructors [ "+CalculatorConstructors.length+" ] ");  
		for(Constructor CalculatorConstructor : CalculatorConstructors)
		{
			System.out.println("Constructor name [ "+CalculatorConstructor.getName()+" ] ");  
		}
		Method[] calcMethods = Calculator.getMethods();
		System.out.println("Number of Calcultor methods [ "+calcMethods.length+" ] ");  
		for(Method calcMethod : calcMethods)
		{
			System.out.println("Method name [ "+calcMethod.getName()+" ] ");  
		}
		Field[] fields = Calculator.getFields();
		System.out.println("Number of fields are [ "+fields.length+" ] ");  
		for(Field field : fields)
		{
			System.out.println("Field name [ "+field.getName()+" ] ");  
		}
		//Constructor CalculatorConstructor = CalculatorConstructors[0];
		//System.out.println(" Calculator constructor name [ "+CalculatorConstructor.getName()+" ] ");  
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}

}
